package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<CustomerDto> createEmployee(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    // Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getEmployeeId(@PathVariable("id") Long cust_id) {
        CustomerDto customerDto = customerService.getCustomerById(cust_id);
        return ResponseEntity.ok(customerDto);
    }

    // Build Get All Employee REST API
    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllEmployees() {
        List<CustomerDto> employees = customerService.getAllCustomers();
        return ResponseEntity.ok(employees);
    }

}
