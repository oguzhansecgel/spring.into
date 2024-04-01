package com.turkcell.spring.into.services.abstracts;

import com.turkcell.spring.into.dtos.requests.AddProductRequest;

public interface ProductService {

    void add(AddProductRequest dto);
}
