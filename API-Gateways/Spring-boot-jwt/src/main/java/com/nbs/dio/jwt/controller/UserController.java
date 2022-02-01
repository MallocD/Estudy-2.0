package com.nbs.dio.jwt.controller;

import com.nbs.dio.jwt.data.UserData;
import com.nbs.dio.jwt.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailServiceImpl userDetailsService;

    public UserController(UserDetailServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUsers(){
        return userDetailsService.listUsers();
    }

}
