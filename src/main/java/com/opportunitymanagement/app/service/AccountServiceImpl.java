package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.dao.AccountDao;
import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements  AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account createAccount(Account account) {
        return accountDao.createAccount(account);
    }

    @Override
    public List<Account> findAllAccount() {
        return  accountDao.findAllAccount();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

//    @Override
//    public List<Customer> listAllAccount() {
//        return accountDao.listAllAccount();
//    }

    @Override
    public Account getByAccountName(String accountName) {
        return accountDao.getByAccountName(accountName);
    }

    @Override
    public List<User> findAllUsers() {
        return accountDao.findAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return accountDao.getUserById(id);
    }

//    @Override
//    public Customer getCustomerById(Long id) {
//        return accountDao.getCustomerById(id);
//    }
}
