package com.pixelo.health.wellplatefoodnutrientbatch.integratedfoodnutrient.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegratedFoodNutrientRepository extends JpaRepository<IntegratedFoodNutrient, String> {
}
