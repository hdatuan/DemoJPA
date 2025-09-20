package com.example.demoJPA.demoJPA.controller;

import com.example.demoJPA.demoJPA.entity.Student;
import com.example.demoJPA.demoJPA.request.InsertStudentRequest;
import com.example.demoJPA.demoJPA.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping
    public ResponseEntity<?> insertStudent(@RequestBody InsertStudentRequest studentRequest) {
        studentServices.insertStudent(studentRequest);
        return ResponseEntity.ok("Insert student successful");
    }
}
