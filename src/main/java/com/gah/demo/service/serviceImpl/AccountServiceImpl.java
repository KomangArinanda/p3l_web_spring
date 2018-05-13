package com.gah.demo.service.serviceImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gah.demo.entity.Account;
import com.gah.demo.repository.AccountRepository;
import com.gah.demo.request.SignupRequest;
import com.gah.demo.service.AccountService;
import com.gah.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author Komang Arinanda
 * @since 17/02/18
 */

@Service
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AccountServiceImpl implements AccountService {

    @Autowired
    private BranchService branchService;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

//    @Override
//    public List<Account> getAllEmployee(Integer branchId) {
//        return accountRepository.findAllByBranchId(branchId);
//    }
//
//    @Override
//    public List<Account> getAllGuest() {
//        return null;
//    }

//    @Override
//    public Account get(Integer id) {
//        return accountRepository.findOne(id);
//    }

    @Override
    public Account getByEmail(String email) {
        return accountRepository.findOneByEmail(email);
    }

    @Override
    public Account add(SignupRequest request) {
        Account account = new Account();

        account.setName(request.getName());
        account.setEmail(request.getEmail());
        System.out.println(request.getPassword());
        account.setIdentityNumber(request.getIdentityNumber());
        account.setTelephone(request.getTelephone());
        account.setAddress(request.getAddress());
        account.setPassword(request.getPassword());
        account.setRole("guest");
        account.setStatus("active");

        return accountRepository.save(account);
    }

//    @Override
//    public Account addGuest(RegisterGuestRequest request) {
//        Account account = new Account();
//        account.setEmail(request.getEmail());
//        account.setTelephone(request.getTelephone());
//        account.setPassword(request.getPassword());
//        account.setRole("guest");
//        account.setStatus("active");
//        return accountRepository.save(account);
//    }
//
//    @Override
//    public Account addEmployee(SaveEmployeeRequest request) {
//        Account account = new Account();
//
//        try {
//            Branch branch = branchService.get(request.getBranchId());
//            account.setName(request.getName());
//            account.setEmail(request.getEmail());
//            account.setTelephone(request.getTelephone());
//            account.setPassword(request.getPassword());
//            account.setRole(request.getRole());
//            account.setBranch(branch);
//            account.setStatus("active");
//            return accountRepository.save(account);
//        }catch (Exception EX){
//            System.out.println("Error addAccount!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }
//
//    @Override
//    public Account updateEmployee(Integer id, SaveEmployeeRequest request) {
//        Account account;
//
//        try {
//            account = accountRepository.getOne(id);
//            if(account.getStatus().equals("active")) {
//                account.setId(id);
//                account.setName(request.getName());
//                account.setEmail(request.getEmail());
//                account.setTelephone(request.getTelephone());
//                account.setRole(request.getRole());
//                account.setStatus("active");
//                return accountRepository.save(account);
//            }
//            else {
//                System.out.println("Account not found!");
//                return null;
//            }
//        }catch (Exception EX){
//            System.out.println("Error addAccount!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }
//
//    @Override
//    public Account updateGuest(Integer id, SaveGuestAccountRequest request) {
//        Account account;
//
//        try {
//            account = this.get(id);
//            if(account.getStatus().equals("active")){
//                account.setIdentityNumber(request.getIdentityNumber());
//                account.setName(request.getName());
//                account.setAddress(request.getAddress());
//                account.setTelephone(request.getTelephone());
//                account.setEmail(request.getEmail());
//                return accountRepository.save(account);
//            }else {
//                System.out.println("Account not found!");
//                return null;
//            }
//
//        }catch (Exception EX){
//            System.out.println("Error updateAccount!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }

//    @Override
//    public Account resetPassword(Integer id, String password) {
//        Account account;
//
//        try {
//            account = this.get(id);
//            if(account.getStatus().equals("active")){
//                account.setPassword(password);
//                return accountRepository.save(account);
//            }else {
//                System.out.println("Account not found!");
//                return null;
//            }
//
//        }catch (Exception EX){
//            System.out.println("Error updateAccount!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }
//
//    @Override
//    public Account delete(Integer id) {
//        Account account;
//
//        try {
//            account = this.get(id);
//            if(account.getStatus().equals("active")){
//                account.setStatus("not active");
//                return accountRepository.save(account);
//            }else {
//                System.out.println("Account not found!");
//                return null;
//            }
//
//        }catch (Exception EX){
//            System.out.println("Error deleteAccount!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }
//
//    @Override
//    public List<Account> searchAccount(String searchKey) {
//        Scanner scanner = new Scanner(searchKey);
//        List<Account> accountList = new ArrayList<>();
//        if(searchKey.equals("") || searchKey.isEmpty()){
//            accountList = this.getAll();
//        }else if(scanner.hasNextInt()){
//            accountList = accountRepository.searchByIdAndName(searchKey);
//        }else{
//            accountList = accountRepository.searchByName(searchKey);
//        }
//
//        return accountList;
//    }
}
