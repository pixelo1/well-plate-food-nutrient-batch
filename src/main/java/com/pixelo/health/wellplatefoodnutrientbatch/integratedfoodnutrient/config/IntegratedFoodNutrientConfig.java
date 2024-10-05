package com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.config;

import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.dto.IntegratedFoodNutrientFileDto;
import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.entity.IntegratedFoodNutrient;
import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.entity.IntegratedFoodNutrientRepository;
import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.processor.NutrientItemProcessor;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.database.builder.JpaItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Arrays;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
@RequiredArgsConstructor
@Configuration
public class IntegratedFoodNutrientConfig {

    private final EntityManagerFactory entityManagerFactory;

    @Bean
    public Job integratedFoodNutrientJob(JobRepository jobRepository, Step integratedFoodNutrientFileStep) {
        return new JobBuilder("integratedFoodNutrientJob", jobRepository)
                .incrementer(new RunIdIncrementer())
                .start(integratedFoodNutrientFileStep)
                .build();
    }

    @Bean
    public Step integratedFoodNutrientFileStep(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        return new StepBuilder("integratedFoodNutrientFileStep", jobRepository)
                .<IntegratedFoodNutrientFileDto, IntegratedFoodNutrient>chunk(100, platformTransactionManager)
                .reader(integratedFoodNutrientFileReader())
                .processor(new NutrientItemProcessor())
                .writer(integratedFoodNutrientJpaItemWriter())
                .build();
    }

    public FlatFileItemReader integratedFoodNutrientFileReader() {
        String[] arrayNames = Arrays.stream(IntegratedFoodNutrientFileDto.class.getDeclaredFields())
                .flatMap(field -> Stream.of(field.getName()))
                .toList()
                .toArray(new String[0]);
        var fileName = "식품의약품안전처_통합식품영양성분정보_20240925.csv";
        var resource = new ClassPathResource("/files/%s".formatted(fileName));
        return new FlatFileItemReaderBuilder<IntegratedFoodNutrientFileDto>()
                .name(fileName)
                .resource(resource)
                .linesToSkip(1)
                .targetType(IntegratedFoodNutrientFileDto.class)
                .delimited().delimiter(",")
                .names(arrayNames)
                .build();
    }

    @Bean
    public JpaItemWriter integratedFoodNutrientJpaItemWriter() {
        return new JpaItemWriterBuilder<IntegratedFoodNutrient>()
                .entityManagerFactory(entityManagerFactory)
                .usePersist(true)
                .build();
    }
}
