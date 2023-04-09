package com.infopolus.servicedemo.repository;

import com.infopolus.servicedemo.entity.Car;
import com.infopolus.servicedemo.entity.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
    Map<Long, Contact> contacts = new HashMap<>();

    {
        Car honda = new Car(1L, "Honda");
        Car lada = new Car(2L, "Lada");
        Car volvo = new Car(3L, "Volvo");
        Car citroen = new Car(4L, "Citroen");
        contacts.put(1L, new Contact(1L,"Petrov", List.of(honda, lada)));
        contacts.put(2L, new Contact(2L,"Ivanov", List.of(citroen, lada)));
        contacts.put(3L, new Contact(3L,"Sidorov", List.of(honda, volvo)));
        contacts.forEach((i, c) -> System.out.println(c.toString()));
    }

    @Override
    public Contact get(Long id) {
        return contacts.get(id);
    }

    @Override
    public List<Contact> getAll() {
        contacts.forEach((i,c) -> System.out.println(c.toString()));
        return new ArrayList<>(contacts.values());
    }

    @Override
    public void delete(Long id) {
        contacts.remove(id);
    }

    public Contact create(Contact contact) {
        Long id = contacts.keySet().stream().max(Long::compareTo).get() + 1L;
        contact.setId(id);
        return contacts.put(id, contact);
    }
}
