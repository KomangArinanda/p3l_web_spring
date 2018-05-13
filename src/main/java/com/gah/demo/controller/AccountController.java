package com.gah.demo.controller;

import com.gah.demo.entity.Account;
import com.gah.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Account> getAllAccount() {
        return accountService.getAll();
    }

//    @RequestMapping(
//            value = "/{id}",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public Account deleteAccount(@PathVariable Integer id) {
//        return accountService.delete(id);
//    }
//
//    @RequestMapping(
//            value = "/{id}",
//            method = RequestMethod.PUT,
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public Account resetPassword(@PathVariable Integer id, @RequestBody String password) {
//        return accountService.resetPassword(id, password);
//    }
//
//    @RequestMapping(
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE, // Apa yang dikirim
//            consumes = MediaType.APPLICATION_JSON_VALUE // Apa yang diterima
//    )
//    public List<Account> searchAccount(@ModelAttribute("searchKey") String searchKey) {
//        System.out.println(searchKey);
//        return accountService.searchAccount(searchKey);
//    }

}
