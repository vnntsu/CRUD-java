package com.example.dataaccess.provider;

import com.example.service.domain.User;

public interface UserCommandProvider {
    void create(User user);

    void update(User user);

    void deleteBy(Long idUser);
}
