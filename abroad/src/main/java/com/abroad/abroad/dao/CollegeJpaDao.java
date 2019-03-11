package com.abroad.abroad.dao;

import com.abroad.abroad.bean.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CollegeJpaDao extends JpaRepository<College,Integer> {
    @Query("select  c from College c where c.id=?1")
    College findById(int id);
    @Query("select c from College c where c.name=?1")
    List<College> findByName(String name);
    @Query("select c from College c where c.tuition=?1")
    College findByTuition(double tuition);
}
