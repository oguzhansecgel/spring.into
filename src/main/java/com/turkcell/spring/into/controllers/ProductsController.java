package com.turkcell.spring.into.controllers;

import com.turkcell.spring.into.dtos.requests.AddProductRequest;
import com.turkcell.spring.into.entities.Product;
import com.turkcell.spring.into.services.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductsController {

    private final ProductService productService;

    @PostMapping
    public void add(@RequestBody AddProductRequest dto)
    {
        productService.add(dto);
    }
}
