package com.cedge.customerapijwtservice.service;

import com.cedge.customerapijwtservice.model.Departments;
import com.cedge.customerapijwtservice.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Departments saveDepartments(Departments departments);

    void addDepartmentsToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
