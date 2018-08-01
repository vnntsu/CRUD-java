package com.example.dataaccess.repository;

import com.example.service.domain.User;

import java.util.List;

public interface UserQueryRepositoryExtension {
    List<User> getUsers();

    User getUserBy(Long idUser);
}
