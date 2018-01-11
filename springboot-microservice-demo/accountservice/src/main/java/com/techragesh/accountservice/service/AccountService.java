package com.techragesh.accountservice.service;

import com.techragesh.accountservice.domain.Account;
import com.techragesh.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccountByNumber(Integer accountId){
        return accountRepository.findOne(accountId);
    }
}
