package com.example.dietka.model.nutrient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MicroNutrient extends Nutrient {

    private MicroNutrientGeneralType generalType;
    private MicroNutrientSpecificType specificType;


    public MicroNutrient(MicroNutrientGeneralType generalType, double valuePer100g) {
        super(valuePer100g);
        this.generalType = generalType;
    }

}

enum MicroNutrientGeneralType {
    WS_VITAMIN, FS_VITAMIN, MACROMINERAL, TRACEMINERAL

}

enum MicroNutrientSpecificType {
    VIT_B1, VIT_B2, VIT_B3, VIT_B5, VIT_B6, VIT_B7, VIT_B9, VIT_B12, VIT_C, //Water-Soluble Vitamins
    VIT_A, VIT_D, VIT_E, VIT_K, //Fat-Soluble Vitamins
    IRON, MANGANESE, COPPER, ZINC, IODINE, FLUORIDE, SELENIUM, //Trace minerals
    CALCIUM, PHOSPHORUS, MAGNESIUM, SODIUM, CHLORIDE, POTASSIUM, SULFUR //Macrominerals

}


