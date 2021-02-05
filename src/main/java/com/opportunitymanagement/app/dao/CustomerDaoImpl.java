//package com.opportunitymanagement.app.dao;
//
//import com.opportunitymanagement.app.entities.Customer;
//import com.opportunitymanagement.app.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.LinkedList;
//import java.util.List;
//
//@Repository
//public class CustomerDaoImpl implements CustomerDao {
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Override
//    public Customer getCustomerById(Long id) {
//        Customer customer = customerRepository.getOne(id);
//        return customer;
//    }
//
//    @Override
//    public List<Customer> getAllCustomer() {
//        List<Customer> persistedCustomers = customerRepository.findAll();
//        return persistedCustomers;
//    }
//
//    @Override
//    public Customer createCustomer(Customer customer) {
//        Customer customerPersisted=customerRepository.save(customer);
//        return customerPersisted;
//    }
//
//    @Override
//    public Customer updateCustomer(Customer customer) {
//        Customer customerPersisted=getCustomerById(customer.getId());
//        if (customerPersisted==null){
//            System.out.println("Sorry customer doesn't exist");
//        }
//        customerPersisted.setFirstName(customer.getFirstName());
//        customerPersisted.setLastName(customer.getLastName());
//        customerPersisted.setPhone(customer.getPhone());
//        customerPersisted.setEmailAddress(customer.getEmailAddress());
//        customerPersisted.setCountry(customer.getCountry());
//        customerPersisted.setCity(customer.getCity());
//        customerPersisted.setState(customer.getState());
//        return customerRepository.save(customerPersisted);
//    }
//
//    @Override
//    public Customer getCustomerByEmail(String email) {
//        return customerRepository.findByEmailAddress(email);
//    }
//}
