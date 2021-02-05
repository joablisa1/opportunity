//package com.opportunitymanagement.app.controller;
//
//import com.opportunitymanagement.app.entities.Customer;
//import com.opportunitymanagement.app.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.support.SessionStatus;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/customer")
//public class CustomerController extends AbstractController {
//
//    @Autowired private  CustomerService customerService;
//    @Autowired private PasswordEncoder passwordEncoder;
//
//    @RequestMapping("/register")
//    public  String createCustomerForm(Model model){
//        Customer customer=new Customer();
//        model.addAttribute("customer",customer);
//        return "customers/customer_add";
//    }
//    @RequestMapping(value = "/save",method = RequestMethod.POST)
//    public String createCustomer(@ModelAttribute("customer") Customer customer, BindingResult result, Model model, RedirectAttributes redirectAttributes, SessionStatus status) {
//        String password =customer.getPassword();
//        String encodedPwd=passwordEncoder.encode(password);
//        customer.setPassword(encodedPwd);
//
//        Customer persistedCustomer =customerService.createCustomer(customer);
//
//      if (persistedCustomer==null){
//          System.out.println("Record not saved in the database..try again later");
//      }else {
//          System.out.println("Successfully saved in the database");
//      }
//      return "public/login";
//    }
//    @RequestMapping("/getCustomer")
//    public String listCustomer(Model model) {
//        List<Customer> list =customerService.getAllCustomer();
//
////        for (Customer customer:customerService.getAllCustomer())
////            list.add(customer);
//        model.addAttribute("customer",list);
//        return "customers/customer_list";
//    }
//
//
//}
