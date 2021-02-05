package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.dao.OpportunityDao;
import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
  @Service
public class OpportunityServiceImpl implements  OpportunityService {

    @Autowired
    private OpportunityDao opportunityDao;
    @Override
    public Opportunity createOpportunity(Opportunity opportunity) {
        return opportunityDao.createOpportunity(opportunity);
    }
    @Override
    public Opportunity getOpportunityByID(Long id) {
        return opportunityDao.getOpportunityByID(id);
    }

    @Override
    public List<Opportunity> getListOpportunity() {
        return opportunityDao.getListOpportunity();
    }

    @Override
    public Account getByAccountName(String accountName) {
        return opportunityDao.getByAccountName(accountName);
    }

    @Override
    public Account getAccountById(Long id) {
        return opportunityDao.getAccountById(id);
    }

    @Override
    public List<Account> getAccountList() {
        return opportunityDao.getAccountList();
    }
}
