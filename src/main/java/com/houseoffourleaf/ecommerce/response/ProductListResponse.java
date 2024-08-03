package com.houseoffourleaf.ecommerce.response;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductListResponse {
    private List<ProductDTO> products;
}
