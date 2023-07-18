package com.tulio.apimarket.persistence;

import com.tulio.apimarket.persistence.crud.ProductoCrudRepository;
import com.tulio.apimarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
