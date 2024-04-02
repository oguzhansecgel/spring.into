package com.turkcell.spring.into.repositories;

import com.turkcell.spring.into.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    Optional<Category> findByNameIgnoreCase(String name);
}
