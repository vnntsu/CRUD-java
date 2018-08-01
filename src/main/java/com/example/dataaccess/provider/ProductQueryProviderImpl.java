package com.example.dataaccess.provider;

import com.example.dataaccess.repository.ProductQueryRepository;
import com.example.service.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQueryProviderImpl implements ProductQueryProvider {

    @Autowired
    private ProductQueryRepository productQueryRepository;


    @Override
    public List<Product> getAllProducts() {
        return productQueryRepository.getAllProducts();
    }
}
