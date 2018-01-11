package com.techragesh.accountwebfeign.repository;

import com.techragesh.accountwebfeign.domain.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Component
@FeignClient(name = "accountservice")
public interface AccountFeignRepository {

    @GetMapping("/accounts")
    public List<Account> getAccounts();
}
