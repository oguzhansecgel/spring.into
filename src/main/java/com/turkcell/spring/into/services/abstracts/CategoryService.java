package com.turkcell.spring.into.services.abstracts;

import com.turkcell.spring.into.dtos.requests.AddCategoryRequest;
import com.turkcell.spring.into.dtos.responses.AddCategoryResponse;
import com.turkcell.spring.into.entities.Category;

import java.util.List;

public interface CategoryService {

    AddCategoryResponse add(AddCategoryRequest dto);
    void update(Category category);
    void delete(int id);
    List<Category> getAll();
    Category getById(int id);
}
