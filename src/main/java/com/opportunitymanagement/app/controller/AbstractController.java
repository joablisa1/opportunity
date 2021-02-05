package com.opportunitymanagement.app.controller;

import com.opportunitymanagement.app.security.AuthenticatedUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class AbstractController {

    @ModelAttribute("authenticatedUser")
    public AuthenticatedUser authenticatedUser(@AuthenticationPrincipal AuthenticatedUser  authenticatedUser){
        return  authenticatedUser;
    }
    public  static  AuthenticatedUser getCurrentUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof AuthenticatedUser) {
            return ((AuthenticatedUser) principal);
        }
        return null;
    }
//    public  static  boolean isLoggedIn(){
//        return getCurrentUser() !=null;
//    }
}
