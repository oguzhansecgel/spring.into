package com.turkcell.spring.into.services.concretes;

import com.turkcell.spring.into.core.utils.exceptions.types.BusinessException;
import com.turkcell.spring.into.dtos.requests.AddCategoryRequest;
import com.turkcell.spring.into.dtos.responses.AddCategoryResponse;
import com.turkcell.spring.into.entities.Category;
import com.turkcell.spring.into.mappers.CategoryMapper;
import com.turkcell.spring.into.repositories.CategoryRepository;
import com.turkcell.spring.into.services.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public AddCategoryResponse add(AddCategoryRequest dto) {
        categoryWithSameNameShouldNotExist(dto.getCategoryName());

        Category category = CategoryMapper.INSTANCE.categoryFromRequest(dto);

        Category savedCategory =  categoryRepository.save(category);

        return new AddCategoryResponse(savedCategory.getId(), savedCategory.getName());
    }

    @Override
    public void update(Category category) {


    }

    @Override
    public void delete(int id) {

        //Optional<Category> category = categoryRepository.findById(id);
        Category category = categoryRepository.findById(id).orElse(null);
        if(category == null)
            throw new RuntimeException("silinmek istenen kategori bulunamadı");

        categoryRepository.delete(category);

    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }


    private void categoryWithSameNameShouldNotExist(String name){
        Optional<Category> categoryWithSameName = categoryRepository.findByNameIgnoreCase(name);
        if(categoryWithSameName.isPresent())
        {
            throw new BusinessException("Aynı isimli 2. kategori eklenemez");
        }
    }
}
