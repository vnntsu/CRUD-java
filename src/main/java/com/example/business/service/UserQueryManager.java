package com.example.business.service;

import com.example.dataaccess.provider.UserQueryProvider;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQueryManager {

    @Autowired
    private UserQueryProvider userQueryProvider;

    public List<User> getUsers() {
        return userQueryProvider.getUsers();
    }

    public User getUserBy(Long idUser) {
        return userQueryProvider.getUserBy(idUser);
    }
}
