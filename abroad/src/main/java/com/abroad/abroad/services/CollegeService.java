package com.abroad.abroad.services;

import com.abroad.abroad.bean.College;

import java.util.List;

public interface CollegeService {
    List<College> getColleges();

    College getById(int id);

    List<College> getByName(String name);

    College getByTuition(double tuition);

    College addCollege(College college);

    College updateCollege(College college);

    void deleteCollege(int id);
}
