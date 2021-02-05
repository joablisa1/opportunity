package com.opportunitymanagement.app.entities;

public enum Stage {

    DISCOVERY("Discovery"), PROPOSAL_SHARED("Proposal_shared"), NEGOTIATION("Negotiation");

    private final String stage;

    Stage(String stage) {
        this.stage=stage;
    }

    public String getStage() {
        return stage;
    }
}
