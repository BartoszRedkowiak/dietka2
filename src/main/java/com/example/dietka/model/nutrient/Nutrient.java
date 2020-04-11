package com.example.dietka.model.nutrient;

import com.example.dietka.model.DatabaseEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class Nutrient extends DatabaseEntity {
    private double valuePer100g;

    public Nutrient(double valuePer100g) {
        this.valuePer100g = valuePer100g;
    }

}








