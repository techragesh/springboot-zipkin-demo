package com.techragesh.stockservice.service;

import com.techragesh.stockservice.domain.Stock;
import com.techragesh.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllAccounts(){
        return stockRepository.findAll();
    }

    public Stock getAccountByNumber(Integer stockId){
        return stockRepository.findOne(stockId);
    }
}
