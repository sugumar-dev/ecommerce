package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryDTO {

    private String code;
    private String name;
    private String description;
    private char newArrivals;
}

