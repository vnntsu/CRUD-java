package com.example.dataaccess.repository;

import com.example.service.domain.User;

public interface UserCommandRepositoryExtension {
    void create(User user);

    void update(User user);

    void deleteBy(Long idUser);
}
