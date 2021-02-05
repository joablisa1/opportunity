package com.opportunitymanagement.app.dao;




import com.opportunitymanagement.app.entities.Permission;
import com.opportunitymanagement.app.entities.Role;
import com.opportunitymanagement.app.entities.User;
import com.opportunitymanagement.app.repository.PermissionRepository;
import com.opportunitymanagement.app.repository.RoleRepository;
import com.opportunitymanagement.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
@Transactional
public class SecurityDaoImpl implements  SecurityDao {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PermissionRepository permissionRepository;

    @Autowired
    RoleRepository roleRepository;


    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public String resetPassword(String email) {

        User user =findUserByEmail(email);
        if(user ==null){
            System.out.println("invalide Email");

        }
        String uuid= UUID.randomUUID().toString();
        user.setPasswordResetToken(uuid);
        return uuid;
    }

    @Override
    public void updatePassword(String email, String token, String password) {
        User user =findUserByEmail(email);
        if (user==null){
            System.out.println("Invalid email");
        }
        if (!StringUtils.hasText(token) || !token.equals(user.getPasswordResetToken())){
            System.out.println("invalid password token");
        }
        user.setUserpassword(password);
        user.setPasswordResetToken(null);
    }

    @Override
    public boolean verifyPasswordResetToken(String email, String token) {
        User user =findUserByEmail(email);
        if (user ==null){
            System.out.println("invalid email");
        }
        if (!StringUtils.hasText(token) || !token.equals(user.getPasswordResetToken())){
            return  false;
        }
        return true;
    }

    @Override
    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    @Override
    public Role createRole(Role role) {
        Role roleByName =getRoleByName(role.getName());
        if (roleByName !=null){
            System.out.println("Role" + role.getName()+"already exist");
        }
        List<Permission> persistedPermissions=new ArrayList<>();
        List<Permission> permissions =role.getPermissions();
        if (permissions !=null){
            for (Permission permission:permissions){
                if (permission.getId() !=null){
                    persistedPermissions.add(permissionRepository.getOne(permission.getId()));
                }
            }
        }
        role.setPermissions(persistedPermissions);
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        Role persistedRole =getRoleById(role.getId());
        if (persistedRole ==null){
            System.out.println("Role" +role.getId()+"doesn't exist");

        }
        persistedRole.setDescription(role.getDescription());
        List<Permission> updatedPermissions=new ArrayList<>();
        List<Permission> permissions =role.getPermissions();
        if (permissions !=null){
            for (Permission permission:permissions) {
                if (permission.getId()!=null){
                    updatedPermissions.add(permissionRepository.getOne(permission.getId()));
                }
            }
        }
        persistedRole.setPermissions(updatedPermissions);
        return roleRepository.save(persistedRole);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.getOne(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        User userByEmail =findUserByEmail(user.getEmail());
        if (userByEmail !=null){
            System.out.println("Email" + user.getEmail()+"already in use");
        }
        List<Role> persistedRoles =new ArrayList<>();
        List<Role>roles =user.getRoles();
        if(roles !=null){
            for (Role role:roles){
                if (role.getId()!=null){
                    persistedRoles.add(roleRepository.getOne(role.getId()));
                }
            }
        }
        user.setRoles(persistedRoles);
        return userRepository.save(user);
    }

    @Override

    public User updateUser(User user) {
        User persistedUser =getUserById(user.getId());
        if (persistedUser == null){
            System.out.println("User"+user.getId()+"doesn't exist");
        }
        List<Role>updatedRoles=new ArrayList<>();
        List<Role> roles = user.getRoles();
        if (roles !=null){
            for (Role role: roles) {
                if (role.getId()!=null){
                    updatedRoles.add(roleRepository.getOne(role.getId()));
                }
            }
        }
        persistedUser.setRoles(updatedRoles);
        return userRepository.save(persistedUser);
    }
}
