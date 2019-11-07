package com.nlb.security.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/test")
    public String test01(){
        return "test";
    }

    @GetMapping("/root")
    @PreAuthorize("hasAuthority('root')")
    public String test02(){
        return "root";
    }

    @GetMapping("/nlb")
    @PreAuthorize("hasAnyAuthority('nlb','root')")
    public String test03(){
        return "root";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('user')")
    public String test04(){
        return "user";
    }
}
