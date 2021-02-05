package com.opportunitymanagement.app.dao;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.User;
import com.opportunitymanagement.app.repository.AccountRepository;
import com.opportunitymanagement.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements  AccountDao {
    @Autowired
    private AccountRepository accountRepository;


    @Autowired
    private UserRepository userRepository;


    @Override
    public Account getByAccountName(String accountName) {
        return accountRepository.getByAccountName(accountName);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

//    @Override
//    public Customer getCustomerById(Long id) {
//        return customerRepository.getOne(id);
//    }

    @Override
    public Account createAccount(Account account) {
        Account persistedAccount=getByAccountName(account.getAccountName());
        User User=new User();
        if (persistedAccount!=null){
            System.out.println("Sorry the account already exist ");
        }
        return accountRepository.save(account);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.getOne(id);
    }

    @Override
    public Account updateAccount(Account account) {
        Account persistedAccount=getAccountById(account.getId());
        if (persistedAccount==null){
            System.out.println("Sorry "+ account.getId()+ "doesn't exist");
        }
        persistedAccount.setAccountName(account.getAccountName());
        persistedAccount.setAmount(account.getAmount());
        persistedAccount.setDisabled(account.isDisabled());
        persistedAccount.setUser(getUserById(account.getUser().getId()));
//        persistedAccount.setCustomer(getCustomerById(account.getCustomer().getId()));
        return accountRepository.save(persistedAccount) ;
    }

//    @Override
//    public List<Customer> listAllAccount() {
//        return  customerRepository.findAll();
//    }

}
