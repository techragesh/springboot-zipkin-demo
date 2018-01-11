package com.techragesh.accountwebfeign.repository;

import com.techragesh.accountwebfeign.domain.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> getAccounts();
    Account getAccount(Integer accountId);
}
