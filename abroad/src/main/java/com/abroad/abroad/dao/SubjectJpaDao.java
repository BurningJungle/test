package com.abroad.abroad.dao;

import com.abroad.abroad.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectJpaDao extends JpaRepository<Subject,Integer> {
    Subject findById(int id);
    @Query("select s from Subject s where s.name=?1")
    List<Subject> findByName(String name);
    @Query("select s from Subject s where s.kind=?1")
    List<Subject> findByKind(String kind);
}
