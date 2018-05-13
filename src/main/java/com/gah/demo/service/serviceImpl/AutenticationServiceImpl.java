package com.gah.demo.service.serviceImpl;

import com.gah.demo.entity.Account;
import com.gah.demo.request.LoginRequest;
import com.gah.demo.service.AccountService;
import com.gah.demo.service.AutenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticationServiceImpl implements AutenticationService {

    @Autowired
    private AccountService accountService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public Account login(LoginRequest request) {
        Account account = new Account();
        try{
            System.out.println(request.getEmail());
            account = accountService.getByEmail(request.getEmail());
//            System.out.println("Pass : "+passwordEncoder.encode(account.getPassword()));
//            System.out.println("Decode : "+passwordEncoder.);
            if(account.getPassword().equals(request.getPassword())){
                return account;
            }
            System.out.println("Here");
        }catch (Exception EX){
            System.out.println("Fail");
            System.out.println(EX.getMessage());
        }
        return account;
    }
}
