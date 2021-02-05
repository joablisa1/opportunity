package com.opportunitymanagement.app.form;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.User;

public class AccountForm {
    private Long id;
    private  String accountName;
    private  double amount;
    private boolean disabled;
    private  Long customer_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Account toAccount(){
        Account account =new Account();
        account.setId(id);
        account.setAccountName(accountName);
        account.setAmount(amount);
        account.setDisabled(disabled);
        User user =new User();
        user.setId(customer_id);
        account.setUser(user);
        return account;

    }

    public  static  AccountForm fromAccountForm(Account account){
        AccountForm accountForm=new AccountForm();
        accountForm.setId(account.getId());
        accountForm.setAccountName(account.getAccountName());
        accountForm.setAmount(account.getAmount());
        accountForm.setDisabled(account.isDisabled());
        accountForm.setCustomer_id(account.getUser().getId());
        return accountForm;
    }
}
