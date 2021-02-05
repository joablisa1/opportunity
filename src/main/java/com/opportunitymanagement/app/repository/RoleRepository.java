package com.opportunitymanagement.app.repository;



import com.opportunitymanagement.app.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);

}
