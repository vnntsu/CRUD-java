package com.example.dataaccess.entity;


import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "USER_ENTITY")
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    public UserEntity() {
        super();
    }

    public UserEntity(Long id, String username, String address) {
        super();
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
