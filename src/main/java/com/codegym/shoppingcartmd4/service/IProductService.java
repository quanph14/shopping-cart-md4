package com.codegym.shoppingcartmd4.service;

import com.codegym.shoppingcartmd4.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}