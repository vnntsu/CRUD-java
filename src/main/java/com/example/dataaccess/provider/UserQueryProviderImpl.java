package com.example.dataaccess.provider;

import com.example.dataaccess.repository.UserQueryRepository;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQueryProviderImpl implements UserQueryProvider {

    @Autowired
    private UserQueryRepository userQueryRepository;

    @Override
    public List<User> getUsers() {
        return userQueryRepository.getUsers();
    }

    @Override
    public User getUserBy(Long idUser) {
        return userQueryRepository.getUserBy(idUser);
    }
}
