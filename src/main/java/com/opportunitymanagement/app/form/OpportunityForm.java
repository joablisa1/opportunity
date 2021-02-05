package com.opportunitymanagement.app.form;

import com.opportunitymanagement.app.entities.Account;
import com.opportunitymanagement.app.entities.Opportunity;
import com.opportunitymanagement.app.entities.Stage;

public class OpportunityForm {

    private Long id;
    private String opportunityName;
    private String stage;
    private Long account_id;
    private boolean disabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpportunityName() {
        return opportunityName;
    }

    public void setOpportunityName(String opportunityName) {
        this.opportunityName = opportunityName;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }
    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Opportunity toOpportunity() {
        Opportunity opportunity = new Opportunity();
        opportunity.setId(id);
        opportunity.setOpportunityName(opportunityName);
        opportunity.setStage(Stage.valueOf(stage));
        opportunity.setDisabled(disabled);
        Account account = new Account();
        account.setId(account_id);
        opportunity.setAccount(account);
        return opportunity;
    }

    public static OpportunityForm fromOpportunityForm(Opportunity opportunity) {
        OpportunityForm opportunityForm = new OpportunityForm();
        opportunityForm.setId(opportunity.getId());
        opportunityForm.setOpportunityName(opportunity.getOpportunityName());
        opportunityForm.setStage(opportunity.getStage().toString());
        opportunityForm.setDisabled(opportunity.isDisabled());
        opportunityForm.setAccount_id(opportunity.getAccount().getId());
        return opportunityForm;
    }
}
