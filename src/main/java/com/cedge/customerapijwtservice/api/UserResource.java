package com.cedge.customerapijwtservice.api;

import com.cedge.customerapijwtservice.model.User;
import com.cedge.customerapijwtservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequiredArgsConstructor
@RequestMapping("/api")
public class UserResource {

    private final UserService userService;

    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());

    }
}
