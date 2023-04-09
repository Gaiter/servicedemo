package com.infopolus.servicedemo.service;

import com.infopolus.servicedemo.dto.ContactDto;
import com.infopolus.servicedemo.entity.Contact;
import com.infopolus.servicedemo.exception.NotFoundException;
import com.infopolus.servicedemo.exception.UnprocessableEntityException;
import com.infopolus.servicedemo.mapper.ContactMapper;
import com.infopolus.servicedemo.repository.ContactRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService {
    private ContactRepositoryImpl contactRepository;
    private ContactMapper contactMapper;

    @Override
    public ContactDto get(Long id) {
        Contact contact = contactRepository.get(id);
        if (contact == null)
            throw new NotFoundException();
        return contactMapper.toDto(contact);
    }

    @Override
    public List<ContactDto> getAll() {
        return contactMapper.toDto(contactRepository.getAll());
    }

    @Override
    public void delete(Long id) {
        contactRepository.delete(id);
    }

    @Override
    public ContactDto create(ContactDto contactDto) {
        if (contactDto == null || contactDto.getName() == null)
            throw new UnprocessableEntityException();
        return contactMapper.toDto(contactRepository.create(contactMapper.toEntity(contactDto)));
    }
}
