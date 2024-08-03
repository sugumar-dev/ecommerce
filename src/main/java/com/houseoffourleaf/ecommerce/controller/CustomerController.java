package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.entity.Customer;
import com.houseoffourleaf.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private static final Logger log = Logger.getLogger(CustomerController.class.getName());

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{userId}")
    public ResponseEntity<Customer> getCustomerByUserId(@PathVariable String userId) {
        return null;  //customerService.getCustomerByUserId(userId);
     }


    @PostMapping("/signup")
    public void registerCustomer(){

    }

    @PutMapping("/modify-customer/{user_id}")
    public void updateCustomer(){

    }

    @DeleteMapping("/deactivate/{user_id}")
    public void deactivateCustomer(){

    }
}
