package com.abroad.abroad.services;

import com.abroad.abroad.bean.User;

public interface LoginService {

    User findByUserphonenumberAndUserpassword(String userPhoneNumber);
}
