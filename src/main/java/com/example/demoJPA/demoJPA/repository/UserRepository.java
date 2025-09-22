package com.example.demoJPA.demoJPA.repository;

import com.example.demoJPA.demoJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByEmailAndPassword(String email, String password);

}
