package com.example.demoJPA.demoJPA.services.implement;

import com.example.demoJPA.demoJPA.entity.Users;
import com.example.demoJPA.demoJPA.repository.UserRepository;
import com.example.demoJPA.demoJPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

}
