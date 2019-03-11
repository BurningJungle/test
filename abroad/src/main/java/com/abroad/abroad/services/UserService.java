package com.abroad.abroad.services;

import com.abroad.abroad.bean.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getById(int id);

    List<User> getByName(String name);

    List<User> getByGender(String gender);

    List<User> getByCountry(String country);

    User addUser(User user);

    User updateUser(User user);

    void deleteUser(int id);
}
