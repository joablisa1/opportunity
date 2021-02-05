package com.opportunitymanagement.app.dao;

import com.opportunitymanagement.app.entities.Permission;
import com.opportunitymanagement.app.entities.Role;
import com.opportunitymanagement.app.entities.User;

import java.util.List;

public interface SecurityDao {

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

    List<User>findAllUsers();

    User createUser(User user);

    User updateUser(User user);
}
