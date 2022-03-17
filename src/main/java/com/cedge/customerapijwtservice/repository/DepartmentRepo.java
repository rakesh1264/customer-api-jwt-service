package com.cedge.customerapijwtservice.repository;

import com.cedge.customerapijwtservice.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Departments,Long> {
    Departments findByName(String name);
}
