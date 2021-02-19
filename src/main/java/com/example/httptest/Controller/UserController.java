package com.example.httptest.Controller;

import com.example.httptest.Service.UserService;
import com.example.httptest.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    public boolean register(@RequestParam("userId") String userId, @RequestParam("password") String password)
    {
        return userService.register(userId, password);
    }

    @PostMapping(value = "/login")
    public User loginCheck(@RequestParam("userId") String userId, @RequestParam("password")String password)
    {
        return userService.loginCheck(userId, password);
    }
}
