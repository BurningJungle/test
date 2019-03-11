package com.abroad.abroad.services.impl;

import com.abroad.abroad.bean.College;
import com.abroad.abroad.dao.CollegeJpaDao;
import com.abroad.abroad.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeJpaDao collegeJpaDao;

    public List<College> getColleges() {
        return collegeJpaDao.findAll();
    }

    public College getById(int id) {
        return collegeJpaDao.findById(id);
    }

    public List<College> getByName(String name) {
        return collegeJpaDao.findByName(name);
    }


    public College getByTuition(double tuition) {
        return collegeJpaDao.findByTuition(tuition);
    }
    public College addCollege(College college) {
        return collegeJpaDao.save(college);
    }

    public College updateCollege(College college) {
        return collegeJpaDao.save(college);
    }

    public void deleteCollege(int id) {
        collegeJpaDao.deleteById(id);
    }
}
