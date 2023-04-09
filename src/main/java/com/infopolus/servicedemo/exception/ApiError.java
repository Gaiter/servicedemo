package com.infopolus.servicedemo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ApiError {

    private int code;
    private String message;

}
