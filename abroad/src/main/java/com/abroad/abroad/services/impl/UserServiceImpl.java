package com.abroad.abroad.services.impl;

import com.abroad.abroad.bean.User;
import com.abroad.abroad.dao.UserJpaDao;
import com.abroad.abroad.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserJpaDao userJpaDao;

    public List<User> getUsers() {
        return userJpaDao.findAll();
    }

    public User getById(int id) {
        return userJpaDao.findById(id);
    }

    public List<User> getByName(String name) {
        return userJpaDao.findByName(name);
    }

    public List<User> getByGender(String gender) {
        return userJpaDao.findByGender(gender);
    }

    public List<User> getByCountry(String country) {
        return userJpaDao.findByCountry(country);
    }

    public User addUser(User user) {
        return userJpaDao.save(user);
    }

    public User updateUser(User user) {
        return userJpaDao.save(user);
    }

    public void deleteUser(int id) {
        userJpaDao.deleteById(id);
    }
}
