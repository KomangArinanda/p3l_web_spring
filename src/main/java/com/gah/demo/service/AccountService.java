package com.gah.demo.service;


import com.gah.demo.entity.Account;
import com.gah.demo.request.SignupRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Komang Arinanda
 * @since 20/01/18
 */
@Service
public interface AccountService {
    List<Account> getAll();
//    List<Account> getAllEmployee(Integer branchId);
//    List<Account> getAllGuest();
//    Account get(Integer id);
    Account getByEmail(String email);
    Account add(SignupRequest request);
//    Account addGuest(RegisterGuestRequest request);
//    Account addEmployee(SaveEmployeeRequest request);
//    Account updateEmployee(Integer id, SaveEmployeeRequest request);
//    Account updateGuest(Integer id, SaveGuestAccountRequest request);
//    Account resetPassword(Integer id, String password);
//    Account delete(Integer id);
//    List<Account> searchAccount(String searchKey);
}
