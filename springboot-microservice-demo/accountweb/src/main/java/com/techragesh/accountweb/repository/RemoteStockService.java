package com.techragesh.accountweb.repository;

import com.techragesh.accountweb.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RemoteStockService implements StockRepository {

    @Autowired
    protected RestTemplate restTemplate;

    protected String serviceURL;

    public RemoteStockService(String serviceURL) {
        this.serviceURL = serviceURL.startsWith("http") ? serviceURL
                : "http://" + serviceURL;
    }

    @Override
    public List<Stock> getStocks() {
        Stock[] accounts = restTemplate.getForObject(serviceURL+"/stocks", Stock[].class);
        return Arrays.asList(accounts);
    }

    @Override
    public Stock getStock(Integer stockId) {
        return restTemplate.getForObject(serviceURL + "/stock/{id}",
                Stock.class, stockId);
    }
}
