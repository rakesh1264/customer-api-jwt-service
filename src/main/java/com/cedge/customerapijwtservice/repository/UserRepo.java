package com.cedge.customerapijwtservice.repository;

import com.cedge.customerapijwtservice.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
