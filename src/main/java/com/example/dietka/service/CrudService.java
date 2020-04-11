package com.example.dietka.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CrudService<T> {

    T findOne(Long id);
    List<T> findAll();
    Page<T> findAll(Pageable pageable);
    T createOrUpdate(T t);
    void delete(Long id);

}
