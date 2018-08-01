package com.example.dataaccess.repository;

import com.example.dataaccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommandRepository extends JpaRepository<UserEntity, Long>, UserCommandRepositoryExtension {
}
