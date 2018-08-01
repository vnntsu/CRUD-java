package com.example.business;

import com.example.business.service.ProductQueryManager;
import com.example.service.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductManager {
    @Autowired
    private ProductQueryManager productQueryManager;

    public List<Product> getAllProducts() {
        return productQueryManager.getAllProducts();
    }
}
