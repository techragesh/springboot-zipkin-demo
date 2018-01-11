package com.techragesh.accountwebfeign.repository;

import com.techragesh.accountwebfeign.domain.Stock;

import java.util.List;

public interface StockRepository {

    List<Stock> getStocks();
    Stock getStock(Integer stockId);
}
