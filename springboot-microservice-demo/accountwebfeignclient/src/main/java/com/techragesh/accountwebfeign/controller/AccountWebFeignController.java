package com.techragesh.accountwebfeign.controller;

import com.techragesh.accountwebfeign.repository.AccountFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/accountfeignclient")
public class AccountWebFeignController {

    @Autowired
    private AccountFeignRepository accountFeignRepository;

    @GetMapping("/acc")
    public ModelAndView getAccounts(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountinfo", accountFeignRepository.getAccounts());
        modelAndView.setViewName("accountinfo");
        return modelAndView;
    }
}
