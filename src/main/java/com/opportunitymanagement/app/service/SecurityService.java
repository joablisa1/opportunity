package com.opportunitymanagement.app.service;

import com.opportunitymanagement.app.entities.Permission;
import com.opportunitymanagement.app.entities.Role;
import com.opportunitymanagement.app.entities.User;

import java.util.List;

public interface SecurityService {

    User findUserByEmail(String email);

    String resetPassword(String email);

    void updatePassword(String email, String token, String password);

    boolean verifyPasswordResetToken(String email, String token);

    List<Permission> getAllPermissions();

    List<Role> getAllRoles();

    Role getRoleByName(String roleName);

    Role createRole(Role role);

    Role updateRole(Role role);

    Role getRoleById(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(User user);

    List<User>findAllUsers();
}
