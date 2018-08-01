package com.example.dataaccess.provider;

import com.example.dataaccess.repository.UserCommandRepository;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCommandProviderImpl implements UserCommandProvider {

    @Autowired
    private UserCommandRepository userCommandRepository;

    @Override
    public void create(User user) {
        userCommandRepository.create(user);
    }

    @Override
    public void update(User user) {
        userCommandRepository.update(user);
    }

    @Override
    public void deleteBy(Long idUser) {
        userCommandRepository.deleteBy(idUser);
    }
}
