package com.example.dataaccess.provider;

import com.example.service.domain.User;

import java.util.List;

public interface UserQueryProvider {
    List<User> getUsers();

    User getUserBy(Long idUser);
}
