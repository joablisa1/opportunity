package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.dao.SecurityDao;
import com.opportunitymanagement.app.entities.Permission;
import com.opportunitymanagement.app.entities.Role;
import com.opportunitymanagement.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SecurityServiceImpl implements  SecurityService {
    @Autowired
    private SecurityDao securityDao;

    @Override
    public User findUserByEmail(String email) {
        return securityDao.findUserByEmail(email);
    }

    @Override
    public String resetPassword(String email) {
        return securityDao.resetPassword(email);
    }

    @Override
    public void updatePassword(String email, String token, String password) {
      securityDao.updatePassword(email, token, password);
    }

    @Override
    public boolean verifyPasswordResetToken(String email, String token) {
        securityDao.verifyPasswordResetToken(email, token);
        return false;
    }

    @Override
    public List<Permission> getAllPermissions() {
        return securityDao.getAllPermissions();
    }

    @Override
    public List<Role> getAllRoles() {
        return securityDao.getAllRoles();
    }

    @Override
    public Role getRoleByName(String roleName) {
        return securityDao.getRoleByName(roleName);
    }

    @Override
    public Role createRole(Role role) {
        return  securityDao.createRole(role);
    }

    @Override
    public Role updateRole(Role role) {
        return securityDao.updateRole(role);
    }

    @Override
    public Role getRoleById(Long id) {
        return securityDao.getRoleById(id);
    }

    @Override
    public User getUserById(Long id) {
        return securityDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return securityDao.getAllUsers();
    }
    @Override
    public User createUser(User user) {
        return  securityDao.createUser(user);
    }
    @Override
    public User updateUser(User user) {
        return  securityDao.updateUser(user);
    }

    @Override
    public List<User> findAllUsers() {
        return securityDao.findAllUsers();
    }
}
