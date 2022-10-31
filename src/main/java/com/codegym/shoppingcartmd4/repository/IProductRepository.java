package com.codegym.shoppingcartmd4.repository;

import com.codegym.shoppingcartmd4.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}