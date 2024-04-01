package com.turkcell.spring.into.services.concretes;

import com.turkcell.spring.into.dtos.requests.AddProductRequest;
import com.turkcell.spring.into.entities.Product;
import com.turkcell.spring.into.mappers.ProductMapper;
import com.turkcell.spring.into.repositories.ProductRepository;
import com.turkcell.spring.into.services.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void add(AddProductRequest dto) {
        Product product = ProductMapper.INSTANCE.productFromAddRequest(dto);

        productRepository.save(product);
    }
}
