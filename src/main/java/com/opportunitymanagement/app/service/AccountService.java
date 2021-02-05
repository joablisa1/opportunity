package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.User;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);
    List<Account> findAllAccount();
    Account getAccountById(Long id);
    Account updateAccount(Account account);
//    List<Customer> listAllAccount();
    Account getByAccountName(String accountName);
//    Customer getCustomerById(Long id);
    List<User>findAllUsers();
    User  getUserById(Long id);

}
