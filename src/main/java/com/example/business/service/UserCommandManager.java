package com.example.business.service;

import com.example.dataaccess.provider.UserCommandProvider;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCommandManager {

    @Autowired
    private UserCommandProvider userCommandProvider;

    public void create(User user) {
        userCommandProvider.create(user);
    }

    public void update(User user) { userCommandProvider.update(user); }

    public void deleteBy(Long idUser) {
        userCommandProvider.deleteBy(idUser);
    }
}
