package com.example.business;

import com.example.business.service.UserCommandManager;
import com.example.business.service.UserQueryManager;
import com.example.dataaccess.provider.UserCommandProvider;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserManager {
    @Autowired
    private UserQueryManager userQueryManager;

    @Autowired
    private UserCommandManager userCommandManager;

    public List<User> getUsers() {
        return userQueryManager.getUsers();
    }

    public void create(User user) {
        userCommandManager.create(user);
    }

    public void update(User user) {
        userCommandManager.update(user);
    }

    public User getUserBy(Long idUser) {
        return userQueryManager.getUserBy(idUser);
    }

    public void deleteBy(Long idUser) {
        return userCommandManager.deleteBy(idUser);
    }
}
