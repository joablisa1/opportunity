//package com.opportunitymanagement.app.service;
//
//import com.opportunitymanagement.app.dao.CustomerDao;
//import com.opportunitymanagement.app.entities.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerServiceImpl implements  CustomerService {
//
//    @Autowired
//    CustomerDao  customerDao;
//
//    @Override
//    public Customer getCustomerById(Long id) {
//        return  customerDao.getCustomerById(id);
//    }
//
//    @Override
//    public List<Customer> getAllCustomer() {
//        return customerDao.getAllCustomer();
//    }
//
//    @Override
//    public Customer createCustomer(Customer customer) {
//        return customerDao.createCustomer(customer);
//    }
//
//    @Override
//    public Customer updateCustomer(Customer customer) {
//        return  customerDao.updateCustomer(customer);
//    }
//
//    @Override
//    public Customer getCustomerByEmail(String email) {
//        return  customerDao.getCustomerByEmail(email);
//    }
//}
