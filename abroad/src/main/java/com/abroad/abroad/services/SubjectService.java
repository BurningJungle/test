package com.abroad.abroad.services;

import com.abroad.abroad.bean.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getSubjects();
    Subject getById(int id);

    List<Subject> getByName(String name);

    List<Subject> getByKind(String kind);

    Subject addSubject(Subject subject);

    Subject updateSubject(Subject subject);

    void deleteSubject(int id);
}
