package com.infopolus.servicedemo.mapper;

import com.infopolus.servicedemo.dto.CarDto;
import com.infopolus.servicedemo.dto.ContactDto;
import com.infopolus.servicedemo.entity.Car;
import com.infopolus.servicedemo.entity.Contact;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto toDto(Car cars);

    Car toEntity(CarDto carDtos);

    List<CarDto> toDto(List<Car> cars);

    List<Car> toEntity(List<CarDto> carDtos);

}
