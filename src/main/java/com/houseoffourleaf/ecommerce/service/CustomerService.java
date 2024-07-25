package com.houseoffourleaf.ecommerce.service;

import com.houseoffourleaf.ecommerce.EcommerceApplication;
import com.houseoffourleaf.ecommerce.entity.Customer;
import com.houseoffourleaf.ecommerce.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CustomerService {

    private static final Logger log = Logger.getLogger(CustomerService.class.getName());

    private CustomerRepository customerRepository;

    public Customer getCustomerByUserId(String userId){
        return null;
    }
}
