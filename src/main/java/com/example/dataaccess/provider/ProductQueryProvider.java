package com.example.dataaccess.provider;

import com.example.service.domain.Product;

import java.util.List;

public interface ProductQueryProvider {
    List<Product> getAllProducts();
}
