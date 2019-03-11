package com.abroad.abroad.controller;

import com.abroad.abroad.bean.Subject;
import com.abroad.abroad.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping
    public List<Subject> getAll(){
        return subjectService.getSubjects();
    }
    @GetMapping("/getid/{id}")
    public Subject getById(@PathVariable int id){
        return subjectService.getById(id);
    }
    @GetMapping("/getname/{name}")
    public List<Subject> getByName(@PathVariable String name){
        System.out.println(name);
        return subjectService.getByName(name);
    }
    @GetMapping("/getkind/{kind}")
    public List<Subject> getByKind(@PathVariable String kind){
        System.out.print(kind);
        return subjectService.getByKind(kind);
    }
    @PostMapping("/add")
    public Subject addSubject(Subject subject){
        return subjectService.addSubject(subject);
    }
    @PutMapping("/update/{id}")
    public Subject updateSubject(Subject subject){
        return subjectService.updateSubject(subject);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable int id){
        subjectService.deleteSubject(id);
    }
}