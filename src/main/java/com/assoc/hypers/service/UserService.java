package com.assoc.hypers.service;

import com.assoc.hypers.entity.Roles;
import com.assoc.hypers.entity.User;
import com.assoc.hypers.repository.RolesRepository;
import com.assoc.hypers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository roleRepository;

    public User registerUser(User user){
        Roles roles = roleRepository.findById("USER").get();
        Set<Roles> rolesSet = new HashSet<>();
        rolesSet.add(roles);
        user.setRoles(rolesSet);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
        return userRepository.save(user);
    }


    public void adminUser(){
        Roles adminRole = new Roles();
        adminRole.setRoleName("ADMIN");
        adminRole.setRoleDescription("ADMIN ROLE");
        roleRepository.save(adminRole);

        Roles userRoles = new Roles();
        userRoles.setRoleName("USER");
        userRoles.setRoleDescription("USER ROLE");
        roleRepository.save(userRoles);

        User adminUser = new User();
        adminUser.setUserName("admin2023");
        adminUser.setUserFirstName("Admin");
        adminUser.setUserLastName("Hypers");
        adminUser.setUserPassword(getEncodedPassword("Hypers@2023"));
        Set<Roles> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userRepository.save(adminUser);


    }

    private String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

}
