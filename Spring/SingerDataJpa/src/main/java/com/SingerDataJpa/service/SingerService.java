package com.SingerDataJpa.service;

import com.SingerDataJpa.entities.Singer;

import java.util.List;

public interface SingerService {

    List<Singer> findAll();
    List<Singer> findByFirstName(String name);
    List<Singer> findByFirstNameAndLastName(String firstName, String LastName);
}
