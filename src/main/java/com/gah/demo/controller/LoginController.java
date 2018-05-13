package com.gah.demo.controller;

import com.gah.demo.entity.Account;
import com.gah.demo.request.LoginRequest;
import com.gah.demo.service.AutenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private AutenticationService autenticationService;

    @RequestMapping(
            method  = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, // Apa yang dikirim
            consumes = MediaType.APPLICATION_JSON_VALUE // Apa yang diterima
    )
    public Account login(@RequestBody LoginRequest request) {
        System.out.println(request.getEmail());
        System.out.println(request.getPassword());
        return autenticationService.login(request);
    }

}
