package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/products")
public class ProductController {

    private static final Logger log = Logger.getLogger(ProductController.class.getName());

    @Autowired
    private CustomerService customerService;


    @GetMapping("/{user_id}")
    public void fetchProductDetails(){

    }

}
