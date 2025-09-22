package com.example.demoJPA.demoJPA.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BaseResponse {
    private int code;
    private String message;
    private Object data;
}
