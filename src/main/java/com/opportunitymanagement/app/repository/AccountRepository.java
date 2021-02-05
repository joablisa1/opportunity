package com.opportunitymanagement.app.repository;

import com.opportunitymanagement.app.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account,Long> {
    Account getByAccountName(String accountName);
//    Account getById(Long accountId);
}
