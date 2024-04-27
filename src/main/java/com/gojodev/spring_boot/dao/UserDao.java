package com.gojodev.spring_boot.dao;

import com.gojodev.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
}
