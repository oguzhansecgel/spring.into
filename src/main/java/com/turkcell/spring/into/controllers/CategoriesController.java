package com.turkcell.spring.into.controllers;

import com.turkcell.spring.into.entities.Category;
import com.turkcell.spring.into.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor // final değeri kullanabilmek için
public class CategoriesController {

  private final CategoryRepository categoryRepository;
    @GetMapping
    public List<Category> getAll()
    {

        return categoryRepository.findAll();

    }
}
