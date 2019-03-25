package com;

import com.configuration.PersistenceContext;
import com.service.PersonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(PersistenceContext.class);
        PersonService service = ctx.getBean(PersonService.class);
        service.personRun();
        service.findAllPerson();
        service.findOnePerson();
        service.existPerson();
        service.countPerson();
//        service.deletePerson();
//        service.deletePersonByEntityRef();
//        service.deletePersonByIterable();
//        service.deleteAllPerson();
        service.findPersonByFirstname();
        service.findPersonByLastname();
        service.findPersonById();

    }
}
