package com.SingerDataJpa.repo;

import com.SingerDataJpa.entities.Singer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SingerRepository extends CrudRepository<Singer,Long> {

    List<Singer> findByFirstName(String name);
    List<Singer> findByFirstNameAndLastName(String firstName, String LastName);

}
