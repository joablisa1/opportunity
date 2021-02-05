package com.opportunitymanagement.app.security;


import com.opportunitymanagement.app.entities.Permission;
import com.opportunitymanagement.app.entities.Role;
import com.opportunitymanagement.app.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AuthenticatedUser extends org.springframework.security.core.userdetails.User {

    private User user;


    public AuthenticatedUser(User user) {
        super(user.getEmail(),user.getUserpassword(),getAuthorities(user));
        this.user=user;
    }

    public  User getUser(){
        return user;
    }
    private  static Collection<? extends GrantedAuthority>getAuthorities(User user){
        Set<String>roleAndPermissions=new HashSet<>();
        List<Role> roles=user.getRoles();
        for (Role role:roles){
            roleAndPermissions.add(role.getName());
            List<Permission> permissions=role.getPermissions();
            for (Permission permission:permissions){
                roleAndPermissions.add("ROLE_" + permission.getName());
            }
        }
        String[] roleNames=new String[roleAndPermissions.size()];
        Collection<GrantedAuthority>authorities=AuthorityUtils.createAuthorityList(roleAndPermissions.toArray(roleNames));
        return authorities;
    }

}
