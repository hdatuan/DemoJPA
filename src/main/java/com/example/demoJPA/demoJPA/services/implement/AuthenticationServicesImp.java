package com.example.demoJPA.demoJPA.services.implement;

import com.example.demoJPA.demoJPA.entity.Users;
import com.example.demoJPA.demoJPA.repository.UserRepository;
import com.example.demoJPA.demoJPA.services.AuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationServicesImp implements AuthenticationServices {

    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean authenticate(String email, String password) {
        Optional<Users> users = userRepository.findByEmailAndPassword(email, password);

        return users.isPresent();
    }


}
