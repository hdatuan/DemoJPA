package com.example.demoJPA.demoJPA.repository;

import com.example.demoJPA.demoJPA.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// extends JpaRepository< , >
// Tham so 1 : ten cua Entity dai dien cho Table muon JPA xu ly
// Tham so 2 : kieu du lieu cua primary key cua Entity

// @Repository, @Component, @Service
@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
}
