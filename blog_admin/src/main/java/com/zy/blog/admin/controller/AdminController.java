package com.zy.blog.admin.controller;

import com.zy.blog.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public Object login(@RequestParam("username")String username, @RequestParam("password")String password){
         adminService.login(username, password);
         return "success";
    }
}
