package com.techragesh.accountweb.repository;

import com.techragesh.accountweb.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RemoteAccountService implements AccountRepository{

    @Autowired
    protected RestTemplate restTemplate;

    protected String serviceURL;

    public RemoteAccountService(String serviceURL){
        this.serviceURL = serviceURL.startsWith("http") ? serviceURL
                : "http://" + serviceURL;
    }

    @Override
    public List<Account> getAccounts() {
        Account[] accounts = restTemplate.getForObject(serviceURL+"/accounts", Account[].class);
        System.out.println("Account Length--->" + accounts.length);
        return Arrays.asList(accounts);
    }

    @Override
    public Account getAccount(Integer accountId) {
        return restTemplate.getForObject(serviceURL + "/account/{id}",
                Account.class, accountId);
    }
}
