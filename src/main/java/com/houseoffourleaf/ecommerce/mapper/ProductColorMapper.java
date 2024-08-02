package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ProductColorDTO;
import com.houseoffourleaf.ecommerce.entity.ProductColor;

public class ProductColorMapper {

    public static ProductColorDTO toDTO(ProductColor productColor) {
        ProductColorDTO productColorDTO = new ProductColorDTO();
        productColorDTO.setCode(productColor.getCode());
        productColorDTO.setName(productColor.getName());
        productColorDTO.setDescription(productColor.getDescription());
        return productColorDTO;
    }

    public static ProductColor toEntity(ProductColorDTO productColorDTO) {
        ProductColor productColor = new ProductColor();
        productColor.setCode(productColorDTO.getCode());
        productColor.setName(productColorDTO.getName());
        productColor.setDescription(productColorDTO.getDescription());
        return productColor;
    }
}
