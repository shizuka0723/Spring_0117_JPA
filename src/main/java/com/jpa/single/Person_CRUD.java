package com.jpa.single;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Person_CRUD {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        
        PersonService service = (PersonService) appContext.getBean("personService");
        //Save
//        Person person = new Person();
//        person.setName("Aoi");
//        service.save(person);
        
        service.updateNameById("Haruka", 3);

        service.printALL();
    }
}
