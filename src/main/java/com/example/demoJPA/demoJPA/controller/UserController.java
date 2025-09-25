package com.example.demoJPA.demoJPA.controller;

import com.example.demoJPA.demoJPA.response.BaseResponse;
import com.example.demoJPA.demoJPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<?> getAllUsers() {

        BaseResponse response = new BaseResponse();
        response.setCode(HttpStatus.OK.value());
        response.setData(userService.findAll());

        return ResponseEntity.ok("");
    }


}
