package com.opportunitymanagement.app.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(nullable = false, unique = true)
    private  String accountName;
    private  double amount;
    private boolean disabled;
    @OneToMany(mappedBy = "account")
    private Set<Opportunity> opportunity =new HashSet<Opportunity>();
//    @ManyToOne
//    @JoinColumn(name = "customer_id",nullable = false)
//    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

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

    public Set<Opportunity> getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Set<Opportunity> opportunity) {
        this.opportunity = opportunity;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
