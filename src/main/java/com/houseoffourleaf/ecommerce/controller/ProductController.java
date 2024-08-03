package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import com.houseoffourleaf.ecommerce.response.ProductListResponse;
import com.houseoffourleaf.ecommerce.response.ProductResponse;
import com.houseoffourleaf.ecommerce.service.ProductService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger log = Logger.getLogger(ProductController.class.getName());

    @Autowired
    private ProductService productService;


    @GetMapping
    public ResponseEntity<ProductListResponse> fetchProductDetails(){
        return ResponseEntity.ok(new ProductListResponse(productService.fetchAllActiveProductDetails()));
    }

    @GetMapping("/{product-code}")
    public ResponseEntity<ProductResponse> fetchProductDetailsByCode(@PathVariable("product-code") String productCode){
        return ResponseEntity.ok(new ProductResponse(productService.fetchActiveProductDetailsByCode(productCode)));
    }

    @PutMapping("/{product-code}/inactivate")
    public ResponseEntity<Boolean> inactivateProductCode(@PathVariable("product-code") String productCode,
                                        @NotBlank @RequestHeader("login_user") String loginUser){
        return ResponseEntity.ok(productService.inactivateProductCode(productCode, loginUser));
    }

    @PutMapping("/{product-code}/activate")
    public ResponseEntity<Boolean> activateProductCode(@PathVariable("product-code") String productCode,
                                         @NotBlank @RequestHeader("login_user") String loginUser){
        return ResponseEntity.ok(productService.activateProductCode(productCode, loginUser));
    }

    @PutMapping("/{product-code}")
    public Boolean updateProduct(@PathVariable("product-code") String productCode,
                                       @NotBlank @RequestBody ProductDTO productDTO,
                                       @NotBlank @RequestHeader("login_user") String loginUser){
        return productService.updateProduct(productDTO, productCode, loginUser);
    }

}
