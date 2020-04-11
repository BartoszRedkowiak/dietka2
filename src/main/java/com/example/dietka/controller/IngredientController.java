package com.example.dietka.controller;

import com.example.dietka.model.Ingredient;
import com.example.dietka.service.CrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final CrudService<Ingredient> crudService;

    public IngredientController(CrudService<Ingredient> crudService) {
        this.crudService = crudService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> getOneIngredient(@PathVariable("id") Long id){
        Ingredient ingredient = crudService.findOne(id);
        return ResponseEntity.ok(ingredient);
    }

    @PostMapping
    public ResponseEntity saveIngredient(@RequestBody Ingredient ingredient){
        crudService.createOrUpdate(ingredient);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity updateIngredient(@RequestBody Ingredient ingredient){
        crudService.createOrUpdate(ingredient);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity deleteIngredient(@RequestBody Ingredient ingredient){
        crudService.createOrUpdate(ingredient);
        return ResponseEntity.ok().build();
    }



}
