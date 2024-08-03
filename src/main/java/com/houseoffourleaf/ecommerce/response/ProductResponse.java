package com.houseoffourleaf.ecommerce.response;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductResponse {

    private ProductDTO product;
}
