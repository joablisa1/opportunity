package com.opportunitymanagement.app.controller;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.User;
import com.opportunitymanagement.app.form.AccountForm;
import com.opportunitymanagement.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController extends  AbstractController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/new")
    public String createAccountForm(Model model){
        AccountForm account =new AccountForm();
        model.addAttribute("accountForm",account);
        return "accounts/account_add";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public  String createdAccount(@ModelAttribute("accountForm")AccountForm accountForm, Model model, RedirectAttributes redirectAttributes, BindingResult result, SessionStatus status){
        if (result.hasErrors()){
            return "accounts/account_add";
        }
        Account account=accountForm.toAccount();
        Account persistedAccount=accountService.createAccount(account);
        redirectAttributes.addFlashAttribute("info","Product created successfully");
        status.setComplete();
        return "redirect:/account/getAccount";
    }
    @RequestMapping("/getAccount")
    public  String listProducts(Model model){
        model.addAttribute("account", accountService.findAllAccount());
        return "accounts/account_list";
    }

    @ModelAttribute("/customerList")
    public List<User> categoriesList(Model model){
        List<User> customerList=accountService.findAllUsers();
        model.addAttribute("customerList",customerList);
        return customerList;
    }

}
