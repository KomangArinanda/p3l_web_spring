package com.gah.demo.service;

import com.gah.demo.entity.Account;
import com.gah.demo.request.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public interface AutenticationService {
    Account login(LoginRequest request);
}
