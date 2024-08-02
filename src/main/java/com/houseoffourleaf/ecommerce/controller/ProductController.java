package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import com.houseoffourleaf.ecommerce.service.ProductService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger log = Logger.getLogger(ProductController.class.getName());

    @Autowired
    private ProductService productService;


    @GetMapping
    public List<ProductDTO> fetchProductDetails(){
        return productService.fetchAllActiveProductDetails();
    }

    @PutMapping("/{product-code}/inactivate")
    public Boolean inactivateProductCode(@PathVariable("product-code") String productCode,
                                        @NotBlank @RequestHeader("login_user") String loginUser){
        return productService.inactivateProductCode(productCode, loginUser);
    }

    @PutMapping("/{product-code}/activate")
    public Boolean activateProductCode(@PathVariable("product-code") String productCode,
                                         @NotBlank @RequestHeader("login_user") String loginUser){
        return productService.activateProductCode(productCode, loginUser);
    }

    @PutMapping("/{product-code}")
    public Boolean updateProduct(@PathVariable("product-code") String productCode,
                                       @NotBlank @RequestBody ProductDTO productDTO,
                                       @NotBlank @RequestHeader("login_user") String loginUser){
        return productService.updateProduct(productDTO, productCode, loginUser);
    }

}
