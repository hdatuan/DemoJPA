package com.example.demoJPA.demoJPA.controller;

import com.example.demoJPA.demoJPA.request.SignInRequest;
import com.example.demoJPA.demoJPA.response.BaseResponse;
import com.example.demoJPA.demoJPA.services.AuthenticationServices;
import com.example.demoJPA.demoJPA.services.implement.AuthenticationServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationServices authenticationServices;


    @PostMapping("/sign-in")
    public ResponseEntity<?> signIn(@RequestBody SignInRequest signInRequest) {
        AuthenticationServices authenticationServices1 = new AuthenticationServicesImp();
        boolean isSuccess = authenticationServices.authenticate(signInRequest.getEmail(), signInRequest.getPassword());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(isSuccess ? 0 : 1 );
        baseResponse.setData(isSuccess);
        return ResponseEntity.ok(baseResponse);
    }


}
