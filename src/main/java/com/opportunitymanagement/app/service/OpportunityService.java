package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.Opportunity;

import java.util.List;

public interface OpportunityService {
    Opportunity createOpportunity(Opportunity opportunity);
    Opportunity getOpportunityByID(Long id);
    List<Opportunity> getListOpportunity();
    Account getByAccountName(String accountName);
    Account getAccountById(Long id);
    List<Account> getAccountList();
}
