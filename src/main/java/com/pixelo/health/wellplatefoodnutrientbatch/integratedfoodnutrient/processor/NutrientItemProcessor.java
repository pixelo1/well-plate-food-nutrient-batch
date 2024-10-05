package com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.processor;

import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.dto.IntegratedFoodNutrientFileDto;
import com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.entity.IntegratedFoodNutrient;
import org.springframework.batch.item.ItemProcessor;

public class NutrientItemProcessor implements ItemProcessor<IntegratedFoodNutrientFileDto, IntegratedFoodNutrient> {

    @Override
    public IntegratedFoodNutrient process(IntegratedFoodNutrientFileDto item) throws Exception {
        return IntegratedFoodNutrient.builder()
                .foodCd(item.foodCd())
                .foodNm(item.foodNm())
                .dataCd(item.dataCd())
                .typeNm(item.typeNm())
                .nutConSrtrQua(item.nutConSrtrQua())
                .enerc(item.enerc())
                .water(item.water())
                .prot(item.prot())
                .fatce(item.fatce())
                .ash(item.ash())
                .chocdf(item.chocdf())
                .sugar(item.sugar())
                .fibtg(item.fibtg())
                .ca(item.ca())
                .fe(item.fe())
                .p(item.p())
                .k(item.k())
                .nat(item.nat())
                .vitaRae(item.vitaRae())
                .retol(item.retol())
                .cartb(item.cartb())
                .thia(item.thia())
                .ribf(item.ribf())
                .nia(item.nia())
                .vitc(item.vitc())
                .vitd(item.vitd())
                .chole(item.chole())
                .fasat(item.fasat())
                .fatrn(item.fatrn())
                .refuse(item.refuse())
                .srcCd(item.srcCd())
                .srcNm(item.srcNm())
                .foodSize(item.foodSize())
                .imptYn(item.imptYn())
                .cooCd(item.cooCd())
                .cooNm(item.cooNm())
                .itemMnftrRptNo(item.itemMnftrRptNo())
                .companyNm(item.companyNm())
                .mkrNm(item.mkrNm())
                .imptrNm(item.imptrNm())
                .rtlBzentyNm(item.rtlBzentyNm())
                .dataProdCd(item.dataProdCd())
                .dataProdNm(item.dataProdNm())
                .crtYmd(item.crtYmd())
                .crtrYmd(item.crtrYmd())
                .build();
    }
}
