package com.example.dietka.model;


import com.example.dietka.model.nutrient.MacroNutrient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ingredients")
public class Ingredient extends DatabaseEntity {

    private String name;

    @ManyToMany
    @JoinTable(name = "ingredients_macronutrients",
    joinColumns = @JoinColumn(name = "ingredient_id"),
    inverseJoinColumns = @JoinColumn(name = "nutrient_id"))
    private Set<MacroNutrient> macroNutrients;

    public Ingredient() {
    }

    public Ingredient(Long id, String name, Set<MacroNutrient> macroNutrients) {
        this.setId(id);
        this.name = name;
        this.macroNutrients = macroNutrients;
    }
}

