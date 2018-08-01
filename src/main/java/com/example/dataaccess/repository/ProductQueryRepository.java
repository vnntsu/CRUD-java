package com.example.dataaccess.repository;

import com.example.dataaccess.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductQueryRepository extends JpaRepository<ProductEntity, Long>, ProductQueryRepositoryExtension {
}
