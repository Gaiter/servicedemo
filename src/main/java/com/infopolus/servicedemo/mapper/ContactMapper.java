package com.infopolus.servicedemo.mapper;

import com.infopolus.servicedemo.dto.ContactDto;
import com.infopolus.servicedemo.entity.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = CarMapper.class)
public interface ContactMapper {

    ContactDto toDto(Contact contact);

    Contact toEntity(ContactDto contactDto);

    List<ContactDto> toDto(List<Contact> contacts);

    List<Contact> toEntity(List<ContactDto> contactDtos);
}
