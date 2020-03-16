package com.jpa.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("familyService")
public class FamilyService {

    @Autowired
    private HusbandRepository hr;

    @Autowired
    private WifeRepository wr;
    
    public void save(Husband husband) {
        hr.save(husband);
        System.out.println("Husband Save OK");
    }

    public Husband findHusbandById(Long id) {
        return hr.findById(id).get();
    }
    
    public Wife findWifeById(Long id) {
        return wr.findById(id).get();
    }

    public void findAll(){
        hr.findAll().forEach(System.out::println);
    }
    
    public void delete(Long id) {
        Husband husband = findHusbandById(id);
        hr.delete(husband);
        System.out.println("Husband delete OK");
    }
    
}
