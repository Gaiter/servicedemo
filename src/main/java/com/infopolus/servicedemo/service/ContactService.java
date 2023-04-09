package com.infopolus.servicedemo.service;

import com.infopolus.servicedemo.dto.ContactDto;
import com.infopolus.servicedemo.entity.Contact;

import java.util.List;

public interface ContactService {
    ContactDto get(Long id);

    List<ContactDto> getAll();

    void delete(Long id);

    ContactDto create(ContactDto contactDto);
}
