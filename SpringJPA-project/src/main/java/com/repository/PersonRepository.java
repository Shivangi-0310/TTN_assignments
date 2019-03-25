package com.repository;

import com.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.StringReader;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findByFirstname (String name);
    List<Person> findByLastname (String name);
    Person findById (Integer id);

}
