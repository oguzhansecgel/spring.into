package com.turkcell.spring.into.controllers;

import com.turkcell.spring.into.entities.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductsController {

    @GetMapping("{name}")
    public String get(@PathVariable String name)
    {
        return "Merhaba "+name;
    }
    @GetMapping("getAll")
    public String getAll()
    {
        return "Get Allım Ben";
    }
    @PostMapping
    public String post(@RequestBody Product product)
    {
        return "Merhaba post";

    }

}
