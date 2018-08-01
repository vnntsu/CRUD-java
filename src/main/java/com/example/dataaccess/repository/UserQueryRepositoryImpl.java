package com.example.dataaccess.repository;

import com.example.service.domain.User;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserQueryRepositoryImpl implements UserQueryRepositoryExtension {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        String attributes = "user.id, user.username, user.address";
        String tables = "UserEntity user";
        String sqlString = "SELECT " + attributes + " FROM " + tables;

        Query query = em.createQuery(sqlString);
        List<Object[]> results = query.getResultList();
        for (Object[] data : results) {
            List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
            System.out.println(row);
            User user = new User();
            user.setId(new Long(row.get(0)));
            user.setUsername(row.get(1));
            user.setAddress(row.get(2));
            users.add(user);
        }
        return users;
    }

    @Override
    public User getUserBy(Long idUser) {
        String queryString = "SELECT user.id, user.username, user.address FROM UserEntity user where user.id=:id";
        Query query = em.createQuery(queryString).setParameter("id", idUser);
        List<Object[]> results = query.getResultList();
        User user = new User();
        for (Object[] data : results) {
            List<String> row = Arrays.asList(data).stream().map(x -> x.toString()).collect(Collectors.toList());
            System.out.println(row);
            user.setId(new Long(row.get(0)));
            user.setUsername(row.get(1));
            user.setAddress(row.get(2));
        }
        return user;
    }
}
