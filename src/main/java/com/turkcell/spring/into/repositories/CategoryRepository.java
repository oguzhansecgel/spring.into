package com.turkcell.spring.into.repositories;

import com.turkcell.spring.into.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
