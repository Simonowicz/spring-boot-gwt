package com.szepietowski.server.model.entities;

import javax.persistence.*;

/**
 * Created by Szymon on 2016-03-13.
 */
@Entity
@Table(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
