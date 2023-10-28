package com.example.crudRapido.controller;

import com.example.crudRapido.entity.Student;
import com.example.crudRapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentID}")
    public Optional<Student> getById(@PathVariable("studentID") Long studentID){
        return studentService.getStudent(studentID);
    }




    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{studentID}")
    public void Delete(@PathVariable("studentID") Long studentID){
        studentService.delete(studentID);
    }


}
