package com.infopolus.servicedemo.controller;

import com.infopolus.servicedemo.dto.ContactDto;
import com.infopolus.servicedemo.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContactRestController {
    private ContactService contactService;

    @GetMapping("/{id}")
    public ContactDto get(@PathVariable Long id) {
        return contactService.get(id);
    }

    @GetMapping
    public List<ContactDto> getAll() {
        return contactService.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        contactService.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    ContactDto create(@RequestBody ContactDto contactDto) {
        return contactService.create(contactDto);
    }
}
