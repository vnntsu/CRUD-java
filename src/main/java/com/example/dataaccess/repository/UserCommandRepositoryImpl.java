package com.example.dataaccess.repository;

import com.example.service.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Component
@Transactional
public class UserCommandRepositoryImpl implements UserCommandRepositoryExtension {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user) {
        String table = "user_entity (username, address)";
        String queryString = "INSERT INTO " + table + " VALUES (:username,:address)";
        Query query = em.createNativeQuery(queryString)
                .setParameter("username", user.getUsername())
                .setParameter("address", user.getAddress());
        System.out.println(queryString);
        query.executeUpdate();
    }

    @Override
    public void update(User user) {
        String queryString = "UPDATE user_entity user set username=:username, address=:address WHERE user.id=:id";
        Query query = em.createNativeQuery(queryString)
                .setParameter("username", user.getUsername())
                .setParameter("address", user.getAddress())
                .setParameter("id", user.getId());
        System.out.println(queryString);
        query.executeUpdate();
    }

    @Override
    public void deleteBy(Long idUser) {
        String queryString = "DELETE from user_entity WHERE user.id=:id";
        Query query = em.createNativeQuery(queryString)
                .setParameter("username", user.getUsername())
                .setParameter("address", user.getAddress())
                .setParameter("id", user.getId());
        System.out.println(queryString);
        query.executeUpdate();
    }
}
