package com.opportunitymanagement.app.controller;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.Opportunity;
import com.opportunitymanagement.app.entities.Stage;
import com.opportunitymanagement.app.form.OpportunityForm;
import com.opportunitymanagement.app.service.OpportunityService;
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
@RequestMapping("/opportunity")
public class OpportunitieController  extends AbstractController{

    @Autowired
    private OpportunityService opportunityService;

    @ModelAttribute("stages")
    public Stage[] getExamTypes() {
        return Stage.values();
    }

    @ModelAttribute("/opportunityList")
    public List<Account> opportunityList(Model model) {
        List<Account> accountList = opportunityService.getAccountList();
        model.addAttribute("accountList", accountList);
        return accountList;
    }

    @RequestMapping("/new")
    public String createOpportunityForm(Model model) {
        OpportunityForm opportunityForm = new OpportunityForm();
        model.addAttribute("opportunityForm", opportunityForm);
        return "opportunity/opportunity_add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createdOpportunityAccount(@ModelAttribute("opportunityForm") OpportunityForm opportunityForm, Model model, RedirectAttributes redirectAttributes, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "opportunity/opportunity_add";
        }
        Opportunity opportunity = opportunityForm.toOpportunity();
        Opportunity opportunityPersisted=opportunityService.createOpportunity(opportunity);
        redirectAttributes.addFlashAttribute("info", "Opportunity created successfully");
        status.setComplete();
        return "redirect:/opportunity/getAllOpportunities";
    }

    @RequestMapping("/getAllOpportunities")
    public  String createOpportunityList(Model model){
        model.addAttribute("opportunity",opportunityService.getListOpportunity());
        return "opportunity/opportunity_list";
    }

    @RequestMapping("/{accountName}")
    private  String accountName(@PathVariable("accountName") String accountName,Model model){
        Account account=opportunityService.getByAccountName(accountName);
        model.addAttribute("account",account);
        return "accounts/account_add";
    }
}
