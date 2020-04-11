package com.example.dietka.model.nutrient;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "macronutrients")
public class MacroNutrient extends Nutrient {

    private MacroNutrientType type;

    public MacroNutrient(MacroNutrientType type, double valuePer100g) {
        super(valuePer100g);
        this.type = type;
    }
}

enum MacroNutrientType {
    CARBOHYDRATE, FAT, PROTEIN

}