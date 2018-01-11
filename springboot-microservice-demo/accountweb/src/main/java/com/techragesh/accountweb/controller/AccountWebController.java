package com.techragesh.accountweb.controller;

import com.techragesh.accountweb.repository.AccountRepository;
import com.techragesh.accountweb.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/accountweb")
public class AccountWebController {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/account")
    public ModelAndView getAllAccount(){
        ModelAndView modelAndView = new ModelAndView();
        if(accountRepository.getAccounts().isEmpty()){
            modelAndView.setViewName("errorinfo");
        }else{
            modelAndView.addObject("accountinfo", accountRepository.getAccounts());
            modelAndView.setViewName("accountinfo");
        }
        return modelAndView;
    }

    @GetMapping("/stock")
    public ModelAndView getAllStock(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stockinfo", stockRepository.getStocks());
        modelAndView.setViewName("accountinfo");
        return modelAndView;
    }

    @GetMapping("/all")
    public ModelAndView getAllAccounts(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountinfo", accountRepository.getAccounts());
        modelAndView.addObject("stockinfo", stockRepository.getStocks());
        modelAndView.setViewName("accountinfo");
        return modelAndView;
    }
}
