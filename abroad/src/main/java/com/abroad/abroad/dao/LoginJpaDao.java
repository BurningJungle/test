package com.abroad.abroad.dao;

import com.abroad.abroad.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginJpaDao extends JpaRepository<User,Integer> {
//    @Query("select  u from College u where u.phoneNumber=?1")
    User findByPhoneNumber(String phoneNumber);
}
