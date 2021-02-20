package com.opportunitymanagement.app.repository;

import com.opportunitymanagement.app.entities.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OpportunityRepository extends JpaRepository<Opportunity,Long> {
//    Opportunity getByOpportunityName(String opportunityName);
//    Opportunity getById(Long id);
//    @Query("select o from  opportunity o where  o.opportunity_name order by o.id desc ")
//    List<Opportunity> search(String query);
}
