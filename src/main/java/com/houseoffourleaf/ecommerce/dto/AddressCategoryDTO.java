package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressCategoryDTO {
    private String code;
    private String name;
    private char activeIndicator;

}
