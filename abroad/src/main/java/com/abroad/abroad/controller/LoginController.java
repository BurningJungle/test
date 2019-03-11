package com.abroad.abroad.controller;

import com.abroad.abroad.bean.LoginRequestVo;
import com.abroad.abroad.bean.LoginResultVo;
import com.abroad.abroad.bean.User;
import com.abroad.abroad.services.LoginService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/{name}/{password}")
    public LoginResultVo loginRequestVo(@RequestParam("data") String data) {
        LoginResultVo loginResultVo = new LoginResultVo();
        try {
            Gson gson = new Gson();
            LoginRequestVo loginRequestVo = gson.fromJson(data, (Type) LoginResultVo.class);
            String userPhoneNumber = loginRequestVo.getUserPhoneNumber();
            String userPassword = loginRequestVo.getUserPassword();
            User user = loginService.findByUserphonenumberAndUserpassword(userPhoneNumber);
            String password = user.getPassword();
            if (password.equals(password)){
                loginResultVo.setCode(200);
                loginResultVo.setInfo("密码正确，登录成功");
            }else{
                loginResultVo.setCode(400);
                loginResultVo.setInfo("密码错误，登录失败");
            }
            return loginResultVo;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return loginResultVo;
    }
}
