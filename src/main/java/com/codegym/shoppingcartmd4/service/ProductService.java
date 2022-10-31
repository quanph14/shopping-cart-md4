package com.codegym.shoppingcartmd4.service;

import com.codegym.shoppingcartmd4.model.Product;
import com.codegym.shoppingcartmd4.repository.IProductRepository;
import com.codegym.shoppingcartmd4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}