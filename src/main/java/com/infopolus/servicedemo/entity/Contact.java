package com.infopolus.servicedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Contact {
    private Long id;
    private String name;
    private List<Car> cars;
}
