package com.opportunitymanagement.app.dao;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.Opportunity;
import com.opportunitymanagement.app.repository.AccountRepository;
import com.opportunitymanagement.app.repository.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OpportunityDaoImpl implements  OpportunityDao {
    @Autowired
    private AccountRepository  accountRepository;

    @Autowired
    private OpportunityRepository opportunityRepository;


    @Override
    public Opportunity createOpportunity(Opportunity opportunity) {

        return opportunityRepository.save(opportunity);
    }

    @Override
    public Opportunity getOpportunityByID(Long id) {
        return opportunityRepository.getOne(id);
    }

    @Override
    public List<Opportunity> getListOpportunity() {
        return opportunityRepository.findAll();
    }

    @Override
    public Account getByAccountName(String accountName) {
        return  accountRepository.getByAccountName(accountName);
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.getOne(id);
    }

    @Override
    public List<Account> getAccountList() {
        return accountRepository.findAll();
    }
}
