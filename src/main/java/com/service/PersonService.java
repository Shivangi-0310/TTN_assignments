package com.service;

import com.entity.Person;
import com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    //CRUD REPOSITORY METHODS

    //saving one object(single row)
    /*public void savePerson(){
         System.out.println("----save()----");
        Person e1 = new Person();
        e1.setFirstname("aakash");
        e1.setLastname("sharma");
        e1.setSalary(900000);
        personRepository.save(e1);
    }*/


    // saving multiple objects(rows)
    public void personRun() {
        System.out.println("----save()---->>>list save");
        List<Person> people = returnPersonList();
        personRepository.save(people);
    }

    List<Person> returnPersonList() {
        return Arrays.asList(Person.create("aakash", "sharma", 23, 90000),
                Person.create("samayra", "mudgal", 33, 90000),
                Person.create("yashu", "jain", 20, 30000),
                Person.create("anvi", "gupta", 27, 98000),
                Person.create("peter", "jonas", 43, 78000),
                Person.create("peter", "sharma", 33, 50000),
                Person.create("navya", "khan", 29, 40000),
                Person.create("ankit", "sharma", 25, 78000),
                Person.create("pushkar", "mudgal", 25, 30000));
    }

    // findAll
    public void findAllPerson() {
        System.out.println("----findAll()----");
        Iterable<Person> people = personRepository.findAll();
        System.out.println(people);
    }

    //findOne
    public void findOnePerson() {
        System.out.println("----findOne()----");
        Person person = personRepository.findOne(1);
        System.out.println(person);
    }

    //exists
    public void existPerson() {
        System.out.println("----exists()----");
        Boolean result = personRepository.exists(7);
        System.out.println("person existence>> " + result);
    }

    //count
    public void countPerson() {
        System.out.println("----count()----");
        long result = personRepository.count();
        System.out.println("person count>> " + result);
    }

    //delete by id
    /*public void deletePerson() {
        System.out.println("----delete()----");
        System.out.println("person count before deletion>> " + personRepository.count());
        personRepository.delete(7);
        System.out.println("person count after deletion>> " + personRepository.count());

    }*/

    //delete by ref
    /*public void deletePersonByEntityRef() {
        System.out.println("----delete()---->>deletePersonByEntityRef");
        System.out.println("person count before deletion>> " + personRepository.count());
        Person person = personRepository.findOne(6);
        personRepository.delete(person);
        System.out.println("person count after deletion>> " + personRepository.count());
    }*/

    // delete via iterable

    /*public void deletePersonByIterable() {
        System.out.println("----delete()---->>deletePersonByIterable");
        System.out.println("person count before deletion>> " + personRepository.count());
        Iterable<Person> person = personRepository.findAll();
        personRepository.delete(person);
        System.out.println("person count after deletion>> " + personRepository.count());

    }*/

    // deleteAll

    /*public void deleteAllPerson() {
        System.out.println("----delete()---->>deleteAllPerson");
        System.out.println("person count before deletion>> " + personRepository.count());
        personRepository.deleteAll();
        System.out.println("person count after deletion>> " + personRepository.count());

    }*/


    public void findPersonByFirstname() {
        System.out.println("find by first name>>>>>>> ");
        List<Person> people = personRepository.findByFirstname("Peter");
        System.out.println(people);
    }

    public void findPersonByLastname() {
        System.out.println("find by last name>>>>>>> ");

        List<Person> people = personRepository.findByLastname("sharma");
        System.out.println(people);

    }

    public void findPersonById() {
        System.out.println("find by id>>>>>>> ");

        Person people = personRepository.findById(1);
        System.out.println(people);
    }

    public void findFirstnameByAge() {
        System.out.println("6. find firstname of person whose age=25 >>>>>>> ");
        List<String> personFirstName = personRepository.findByAge(25);
        System.out.println(personFirstName);
    }

    public void findFirstnameAndLAstnameByAge() {
        System.out.println("find firstname, lastname of person whose age=25 >>>>>>> ");
        String[] personFirstAndLastName = personRepository.findFnameAndLname(25);
        for (String s : personFirstAndLastName) {
            System.out.println(s);
        }
    }

    public void findAllDetail() {
        System.out.println("Get complete information of the Employee whose age= 25>>>>>>>>>>>");
        List<Object[]> personDetail = personRepository.findAllDetail(25);
        System.out.println(personDetail);
    }

    public void countPersonByFirstname() {
        System.out.println("count person whose firstname = Peter>>>>>>>>>>>");
        Integer count = personRepository.countByName("Peter");
        System.out.println("total person with name peter >>> " + count);
    }

    public void sortUsingMethod() {
        System.out.println("sort all person by id of age >25 in descending order >>>>>>>");
        List<Person> people = personRepository.findByAgeGreaterThanOrderByIdDesc(25);
        System.out.println(people);
    }

    public void showPersonUsingSortClass() {
        List<Person> people = personRepository.findAllPersonByAgeSort(new Sort(Sort.Direction.DESC, "id"));
        System.out.println(people);
    }

    public void applyPagination() {
        System.out.println("apply pagination>>>>>>>>>>>>>>>>>>>>>>>>>.");
        Page<Person> personPage = personRepository
                .findAll(
                        new PageRequest(0, 3,
                                new Sort(Sort.Direction.DESC, "id")));

        List<Person> people = personPage.getContent();
        System.out.println(people);
    }

    public void countByName() {
        System.out.println("using count");
        System.out.println("count by name peter is:::" + personRepository.countByFirstname("peter"));
    }

    public void findDistinctByLastname() {
        System.out.println("using DISTINCT");
        List<Person> people = personRepository.findDistinctByLastname("sharma");
        System.out.println(people);
    }

    public void findByFirstnameOrAge() {
        System.out.println("usingOr");
        List<Person> people = personRepository.findByFirstnameOrAge("aakash", 25);
        System.out.println(people);
    }

    public void findByFirstnameAndAge() {
        System.out.println("usingAnd");
        List<Person> people = personRepository.findByFirstnameAndAge("ankit", 25);
        System.out.println(people);
    }

    public void findByAgeBetween() {
        System.out.println("usingBetween");
        List<Person> people = personRepository.findByAgeBetween(23, 29);
        System.out.println(people);
    }

    public void findBySalaryLessThan() {
        System.out.println("usingLessThan");
        List<String> people = personRepository.findBySalaryLessThan(60000);
        System.out.println(people);
    }

    public void findBySalaryGreaterThan() {
        System.out.println("usingGreaterThan");
        List<String> people = personRepository.findBySalaryGreaterThan(60000);
        System.out.println(people);
    }

    public void findByFirstnameLike() {
        System.out.println("usingLike");
        List<Person> people = personRepository.findByFirstnameLike("%aka%");
        System.out.println(people);

    }

    public void findByFirstnameNot() {
        System.out.println("usingNot");
        List<String> people = personRepository.findByFirstnameNot("peter");
        System.out.println(people);
    }

    public void findByAgeIn() {
        System.out.println("usingIN");
        List<Person> people = personRepository.findByAgeIn(Arrays.asList(23,29));
        System.out.println(people);
    }

    public void findByFirstnameIgnoreCase() {
        System.out.println("usingIgnoreCase");
        List<Person> people = personRepository.findByFirstnameIgnoreCase("aakash");
        System.out.println(people);
    }

}
