package com.turkcell.spring.into.repositories;

import com.turkcell.spring.into.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
