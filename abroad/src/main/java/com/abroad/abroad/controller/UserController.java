package com.abroad.abroad.controller;


import com.abroad.abroad.bean.User;
import com.abroad.abroad.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getAll(){
        return userService.getUsers();
    }
    @GetMapping("/getid/{id}")
    public User getById(@PathVariable int id){
        return userService.getById(id);
    }
    @GetMapping("/getname/{name}")
    public List<User> getByName(@PathVariable String name){
        return userService.getByName(name);
    }
    @GetMapping("/getgender/{gender}")
    public List<User> getByGender(@PathVariable String gender){
        return userService.getByGender(gender);
    }
    @GetMapping("getcountry/{country}")
    public List<User> getByCountry(@PathVariable String country){
        return userService.getByCountry(country);
    }
    @PutMapping("/update/{id}")
    public User updateUser(User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }

}
