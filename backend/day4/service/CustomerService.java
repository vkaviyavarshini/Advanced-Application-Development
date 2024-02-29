package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CustomerDto;

public interface CustomerService {
    CustomerDto createCustomer(CustomerDto CustomerDto);

    CustomerDto getCustomerById(Long CustomerId);

    List<CustomerDto> getAllCustomers();
}
