package com.example.dataaccess.repository;

import com.example.service.domain.Product;
import com.example.service.domain.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductQueryRepositoryImpl implements ProductQueryRepositoryExtension {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String attributes = "product.id, product.name, product.price";
        String tables = "ProductEntity product";
        String sqlString = "SELECT " + attributes + " FROM " + tables;

        Query query = em.createQuery(sqlString);
        List<Object[]> result = query.getResultList();
        for (Object[] data : result) {
            List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
            System.out.println(row);
            Product product = new Product();
            product.setId(new Long(row.get(0)));
            product.setName(row.get(1));
            product.setPrice(new Long(row.get(2)));
            products.add(product);
        }
        return products;
    }
}
