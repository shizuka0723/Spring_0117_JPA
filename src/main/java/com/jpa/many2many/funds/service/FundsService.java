package com.jpa.many2many.funds.service;

import com.jpa.many2many.funds.dao.FundService;
import com.jpa.many2many.funds.dao.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fundsService")
public class FundsService {
    @Autowired
    private FundService fundService;
    @Autowired
    private StockService stockService;

    public FundService getFundService() {
        return fundService;
    }

    public StockService getStockService() {
        return stockService;
    }
    
    
}
