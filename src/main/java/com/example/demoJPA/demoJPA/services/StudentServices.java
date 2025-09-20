package com.example.demoJPA.demoJPA.services;

import com.example.demoJPA.demoJPA.entity.Student;
import com.example.demoJPA.demoJPA.repository.StudentRepository;
import com.example.demoJPA.demoJPA.request.InsertStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    public boolean insertStudent(InsertStudentRequest studentRequest) {
        // Create a new Student object
        Student student = new Student();

        // Setting properties for the new Student
        student.setName(studentRequest.getStudentName());
        student.setEmail(studentRequest.getStudentEmail());

        // Save the student using studentRepository.save
        // Assign the returned object to a variable called insertedStudent
        Student insertedStudent = studentRepository.save(student);

        return true;
    }
}
