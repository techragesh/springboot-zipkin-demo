package com.techragesh.accountweb.repository;

import com.techragesh.accountweb.domain.Stock;

import java.util.List;

public interface StockRepository {

    List<Stock> getStocks();
    Stock getStock(Integer stockId);
}
