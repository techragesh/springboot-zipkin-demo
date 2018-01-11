package com.techragesh.accountservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.techragesh.accountservice.domain.Account;
import com.techragesh.accountservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    @HystrixCommand(fallbackMethod = "getAccountFallBack")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping("/account/{id}")
    public Account getAccountById(@PathVariable Integer accountId){
        return accountService.getAccountByNumber(accountId);
    }

    public Account getAccountFallBack() {
        return null;
    }
}
