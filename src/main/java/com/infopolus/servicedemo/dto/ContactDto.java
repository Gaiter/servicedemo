package com.infopolus.servicedemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ContactDto {
    private Long id;
    private String name;
    private List<CarDto> cars;
}
