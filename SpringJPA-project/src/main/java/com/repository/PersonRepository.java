package com.repository;

import com.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findByFirstname(String name);

    List<Person> findByLastname(String name);

    Person findById(Integer id);

    @Query("select firstname from Person where age=:age")
    List<String> findByAge(@Param("age") Integer age);

    @Query("select firstname, lastname from Person where age=:age")
    String[] findFnameAndLname(@Param("age") Integer age);

    @Query("select p from Person p where p.age =:age")
    List<Object[]> findAllDetail(@Param("age") Integer age);

    @Query("select count(*) from Person where firstname=:firstname")
    Integer countByName(@Param("firstname") String name);

    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);

    @Query("select p from Person p where p.age>25")
    List<Person> findAllPersonByAgeSort(Sort sort);

    Page<Person> findAll(Pageable pageable);


}
