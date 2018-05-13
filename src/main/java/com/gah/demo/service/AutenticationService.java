package com.gah.demo.service;

import com.gah.demo.entity.Account;
import com.gah.demo.request.LoginRequest;
import com.gah.demo.request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface AutenticationService {
    Account login(LoginRequest request);
    Account signUp(SignupRequest request);
}
