package com.coderhouse.Clase8.repository;

import com.coderhouse.Clase8.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository {
    public interface productRepository extends JpaRepository<Product, Integer>{

    }
}
