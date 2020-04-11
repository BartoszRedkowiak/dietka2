package com.example.dietka.service;

import com.example.dietka.model.Ingredient;
import com.example.dietka.repository.IngredientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IngredientService implements CrudService<Ingredient> {

    private final IngredientRepository repository;
    private Logger logger = LoggerFactory.getLogger(IngredientService.class);

    @Autowired
    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Ingredient findOne(Long id) {
        Optional<Ingredient> queryResult = repository.findById(id);
        Ingredient extractedIngredient = extractOrReturnEmptyObject(queryResult);
        return extractedIngredient;
    }

    private Ingredient extractOrReturnEmptyObject(Optional<Ingredient> queryResult){
        if (queryResult.isPresent()){
            Ingredient result = queryResult.get();
            logger.info("Successfully found entity with id: " + result.getId());
            return result;
        } else {
            logger.info("Failed search for entity");
            return new Ingredient();
        }
    }

    @Override
    public List<Ingredient> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Ingredient> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Ingredient createOrUpdate(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }



}
