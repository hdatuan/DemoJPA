package com.example.demoJPA.demoJPA.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequest {

    private String email;
    private String password;

    @Override
    public String toString() {
        return super.toString();
    }




}
