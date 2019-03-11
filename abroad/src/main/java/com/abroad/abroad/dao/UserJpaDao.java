package com.abroad.abroad.dao;

import com.abroad.abroad.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserJpaDao extends JpaRepository<User,Integer> {
   // @Query("select u from User u where u.id = ?1")
    User findById(int id);
    @Query("select u from User u where u.name = ?1")
    List<User> findByName(String name);
    @Query("select u from User u where u.gender = ?1")
    List<User> findByGender(String gender);
    @Query("select u from User u where u.country = ?1")
    List<User> findByCountry(String country);
}
