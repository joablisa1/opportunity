package com.opportunitymanagement.app.security;


import com.opportunitymanagement.app.entities.User;
import com.opportunitymanagement.app.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired private SecurityService securityService;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =securityService.findUserByEmail(email);

        if (user==null){
            throw new UsernameNotFoundException("Email"+email+"not found");
        }
        return new AuthenticatedUser(user);
    }
}
