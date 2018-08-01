package com.example.business.service;

import com.example.dataaccess.provider.ProductQueryProvider;
import com.example.service.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQueryManager {
    @Autowired
    private ProductQueryProvider productQueryProvider;

    public List<Product> getAllProducts() {
        return productQueryProvider.getAllProducts();
    }
}
