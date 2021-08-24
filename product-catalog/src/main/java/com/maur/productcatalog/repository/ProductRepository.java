package com.maur.productcatalog.repository;

import com.maur.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
