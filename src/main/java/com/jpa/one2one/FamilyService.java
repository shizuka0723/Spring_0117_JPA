package com.jpa.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("familyService")
public class FamilyService {
    
    @Autowired
    private HusbandRepository hr;
    
    public void save(Husband husband){
        hr.save(husband);
        System.out.println("Husband Save OK");
    }
}
