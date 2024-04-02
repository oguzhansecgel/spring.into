package com.turkcell.spring.into.controllers;

import com.turkcell.spring.into.dtos.requests.AddCategoryRequest;
import com.turkcell.spring.into.dtos.responses.AddCategoryResponse;
import com.turkcell.spring.into.entities.Category;
import com.turkcell.spring.into.services.abstracts.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor // final değeri kullanabilmek için
public class CategoriesController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public ResponseEntity<AddCategoryResponse> add(@RequestBody @Valid AddCategoryRequest dto) {

        AddCategoryResponse response = categoryService.add(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(location).body(response);
    }

    @PutMapping
    public void update(@RequestBody Category category) {
        categoryService.update(category);
    }
}
