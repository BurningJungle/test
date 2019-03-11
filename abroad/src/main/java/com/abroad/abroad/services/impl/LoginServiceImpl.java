package com.abroad.abroad.services.impl;

import com.abroad.abroad.bean.User;
import com.abroad.abroad.dao.LoginJpaDao;
import com.abroad.abroad.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginJpaDao loginJpaDao;

    public User findByUserphonenumberAndUserpassword(String userPhoneNumber) {
        return loginJpaDao.findByPhoneNumber(userPhoneNumber);
    }
}
