package com.cedge.customerapijwtservice.service;

import com.cedge.customerapijwtservice.model.Departments;
import com.cedge.customerapijwtservice.model.User;
import com.cedge.customerapijwtservice.repository.DepartmentRepo;
import com.cedge.customerapijwtservice.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImp implements UserService {
    private final UserRepo userRepo;
    private final DepartmentRepo departmentRepo;
    @Override
    public User saveUser(User user) {
        log.info("String user Name"+ user.getName());
        return userRepo.save(user);
    }

    @Override
    public Departments saveDepartments(Departments departments) {
        return departmentRepo.save(departments);
    }

    @Override
    public void addDepartmentsToUser(String username, String roleName) {
        User user=userRepo.findByUsername(username);
        Departments departments=departmentRepo.findByName(roleName);
        user.getDepartments().add(departments);
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
