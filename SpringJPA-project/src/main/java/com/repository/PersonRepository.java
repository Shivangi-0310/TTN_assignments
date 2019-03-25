package com.repository;

import com.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findByFirstname (String name);
    List<Person> findByLastname (String name);
    Person findById (Integer id);

    @Query("select firstname from Person where age=:age")
    List<String> findByAge(@Param("age") Integer age);

    @Query("select firstname, lastname from Person where age=:age")
    String[] findFnameAndLname(@Param("age") Integer age);


}
