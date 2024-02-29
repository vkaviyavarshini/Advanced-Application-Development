package com.example.demo.mapper;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;

public class CustomerMapper {

    public static CustomerDto maptoCustomerDto(Customer cust) {
        return new CustomerDto(
                cust.getCust_id(),
                cust.getCust_name(),
                cust.getCust_email(),
                cust.getCust_password());
    }

    public static Customer maptoCustomer(CustomerDto custdto) {
        return new Customer(
                custdto.getCust_id(),
                custdto.getCust_name(),
                custdto.getCust_email(),
                custdto.getCust_password());
    }

}
