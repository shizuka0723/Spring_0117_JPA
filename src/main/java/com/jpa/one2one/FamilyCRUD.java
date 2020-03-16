package com.jpa.one2one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FamilyCRUD {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        
        FamilyService service = (FamilyService) appContext.getBean("familyService");
        //Save
        Wife wife = new Wife();
        wife.setName("Haruka");
        Husband husband = new Husband();
        husband.setName("Shizuka");
        husband.setWife(wife);
        service.save(husband);
    }
}
