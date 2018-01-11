package com.techragesh.accountweb.repository;

import com.techragesh.accountweb.domain.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> getAccounts();
    Account getAccount(Integer accountId);
}
