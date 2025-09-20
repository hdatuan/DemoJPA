package com.example.demoJPA.demoJPA.repository;

import com.example.demoJPA.demoJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
