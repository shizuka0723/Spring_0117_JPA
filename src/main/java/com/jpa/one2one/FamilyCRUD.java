package com.jpa.one2one;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FamilyCRUD { 
    static FamilyService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        service = (FamilyService) appContext.getBean("familyService");
    }
    public static void main(String[] args) throws Exception{
        

//        save();
        findHusbandById(51L);
        findWifeById(52L);
//        deleteById(101L);
//        findAll();
    }
    
    public static void deleteById(Long id){
        service.delete(id);
    }

    public static void findAll(){
        service.findAll();
    }
    
    public static void findHusbandById(Long id) throws Exception{
        Husband husband = service.findHusbandById(id);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(husband);
        System.out.println(json);
    }
    
    public static void findWifeById(Long id) throws Exception{
        Wife wife = service.findWifeById(id);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(wife);
        System.out.println(json);
    }
    
    public static void save() {
        Wife wife = new Wife();
        wife.setName("Haruka");
        Husband husband = new Husband();
        husband.setName("Shizuka");
        husband.setWife(wife);
        service.save(husband);
    }
}
