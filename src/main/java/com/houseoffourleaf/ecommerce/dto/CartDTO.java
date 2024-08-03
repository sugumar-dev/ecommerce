package com.houseoffourleaf.ecommerce.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private int id;
    private int productId;
    private int quantity;
    private Integer customerId; // Use Integer for nullable fields

}

