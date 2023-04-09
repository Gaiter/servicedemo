package com.infopolus.servicedemo.repository;

import com.infopolus.servicedemo.entity.Contact;

import java.util.List;

public interface ContactRepository {

    Contact get(Long id);

    List<Contact> getAll();

    void delete(Long id);
}
