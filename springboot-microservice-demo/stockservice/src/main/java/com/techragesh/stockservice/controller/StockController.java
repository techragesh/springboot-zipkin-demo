package com.techragesh.stockservice.controller;

import com.techragesh.stockservice.domain.Stock;
import com.techragesh.stockservice.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public List<Stock> getAllAccounts(){
        return stockService.getAllAccounts();
    }

    @GetMapping("/stock/{id}")
    public Stock getAccountById(@PathVariable Integer stockId){
        return stockService.getAccountByNumber(stockId);
    }
}
