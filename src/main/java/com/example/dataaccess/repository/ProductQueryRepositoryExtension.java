package com.example.dataaccess.repository;

import com.example.service.domain.Product;

import java.util.List;

public interface ProductQueryRepositoryExtension {
    public List<Product> getAllProducts();
}
