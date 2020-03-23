package com.jpa.many2many.funds.dao;

import com.jpa.many2many.funds.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockService extends CrudRepository<Stock, Integer>{
    
}
