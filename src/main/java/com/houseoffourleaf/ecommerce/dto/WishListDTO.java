package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDTO {

    private int id;
    private int customerId;
    private int productId;
    private char activeInd;
}
