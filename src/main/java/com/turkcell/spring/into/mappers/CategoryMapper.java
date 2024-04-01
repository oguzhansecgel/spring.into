package com.turkcell.spring.into.mappers;

import com.turkcell.spring.into.dtos.requests.AddCategoryRequest;
import com.turkcell.spring.into.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "categoryName",target = "name")
    Category categoryFromRequest(AddCategoryRequest request);
}
