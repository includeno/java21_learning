package com.includeno.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@Slf4j
@RestController
class CustomersHttpController {

    @GetMapping("/customers")
    public Collection<Customer> customers() {
        log.info("customers");
        return Set.of(new Customer(1, "A"), new Customer(2, "B"), new Customer(3, "C"));
    }

    record Customer(Integer id, String name) {
    }
}
