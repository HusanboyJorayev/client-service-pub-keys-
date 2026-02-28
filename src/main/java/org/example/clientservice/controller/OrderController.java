package org.example.clientservice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getOrders(Authentication auth) {
        return "Orders for: " + auth.getName() + ", roles: " + auth.getAuthorities();
    }

    @GetMapping("/admin")
    public String getAdminOrders(Authentication auth) {
        return "Admin Orders for: " + auth.getName();
    }
}