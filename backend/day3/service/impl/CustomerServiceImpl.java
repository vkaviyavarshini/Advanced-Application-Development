package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.CustomerMapper;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto custdto) {

        Customer customer = CustomerMapper.maptoCustomer(custdto);
        Customer savedcustomer = customerRepository.save(customer);
        return CustomerMapper.maptoCustomerDto(savedcustomer);
    }

    @Override
    public CustomerDto getCustomerById(Long cust_id) {
        Customer customer = customerRepository.findById(cust_id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("customer is not exist with given id : " + cust_id));

        return CustomerMapper.maptoCustomerDto(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customer : customers) {
            customerDtos.add(CustomerMapper.maptoCustomerDto(customer));
        }

        return customerDtos;
    }

    // @Override
    // public CustomerDto getCustomerById(Long cust_id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    // }

    // @Override
    // public List<CustomerDto> getAllCustomers() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    // }

}
