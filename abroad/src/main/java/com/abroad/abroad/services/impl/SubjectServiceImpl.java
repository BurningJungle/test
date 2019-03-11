package com.abroad.abroad.services.impl;

import com.abroad.abroad.bean.Subject;
import com.abroad.abroad.dao.SubjectJpaDao;
import com.abroad.abroad.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectJpaDao subjectJpaDao;

    public List<Subject> getSubjects() {
        return subjectJpaDao.findAll();
    }
    public Subject getById(int id) {
        return subjectJpaDao.findById(id);
    }
    public List<Subject> getByName(String name){
        System.out.println(name);
        return subjectJpaDao.findByName(name);
    }
    public List<Subject> getByKind(String kind) {
        return subjectJpaDao.findByKind(kind);
    }
    public Subject addSubject(Subject subject) {
        return subjectJpaDao.save(subject);
    }

    public Subject updateSubject(Subject subject) {
        return subjectJpaDao.save(subject);
    }

    public void deleteSubject(int id) {
        subjectJpaDao.deleteById(id);
    }

}
