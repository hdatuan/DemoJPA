package com.example.demoJPA.demoJPA.services;

import com.example.demoJPA.demoJPA.entity.Users;

import java.util.List;

public interface UserService {
    List<Users> findAll();
}
