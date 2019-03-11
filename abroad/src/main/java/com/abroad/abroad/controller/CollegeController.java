package com.abroad.abroad.controller;


import com.abroad.abroad.bean.College;
import com.abroad.abroad.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @RequestMapping
    public List<College> getAll(){
        return collegeService.getColleges();
    }
    @GetMapping("/getid/{id}")
    public College getById(@PathVariable int id){
        return collegeService.getById(id);
    }
    @GetMapping("/getname/{name}")
    public List<College> getByName(@PathVariable String name){
        return collegeService.getByName(name);
    }
    @GetMapping("/gettuition/{tuition}")
    public College getByTuition(@PathVariable double tuition){
        return collegeService.getByTuition(tuition);
    }
    @PostMapping("/add")
    public College addCollege(College college){
        return collegeService.addCollege(college);
    }
    @PutMapping("/update/{id}")
    public College updateCollege(College college){
        return collegeService.updateCollege(college);
    }
    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable int id){
        collegeService.deleteCollege(id);
    }

}
