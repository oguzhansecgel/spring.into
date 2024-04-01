package com.turkcell.spring.into.mappers;

import com.turkcell.spring.into.dtos.requests.AddProductRequest;
import com.turkcell.spring.into.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "categoryId",target = "category.id")
    Product productFromAddRequest(AddProductRequest request);
}
