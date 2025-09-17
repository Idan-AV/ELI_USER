package com.example.demo.controller;


import jakarta.validation.Valid;
import com.example.demo.dto.StudentDto;
import com.example.demo.response.StandardResponse;
import com.example.demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/users")
    public String usersList() {
        return "admin/users";
    }

    @GetMapping("/users/create")
    public String createUser() {
        return "admin/create-user";
    }
}

