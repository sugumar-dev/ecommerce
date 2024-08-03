package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ProductTypeDTO;
import com.houseoffourleaf.ecommerce.entity.ProductType;

public class ProductTypeMapper {

    public static ProductTypeDTO toDTO(ProductType productType) {
        ProductTypeDTO productTypeDTO = new ProductTypeDTO();
        productTypeDTO.setCode(productType.getCode());
        productTypeDTO.setName(productType.getName());
        productTypeDTO.setDescription(productType.getDescription());
        return productTypeDTO;
    }

    public static ProductType toEntity(ProductTypeDTO productTypeDTO) {
        ProductType productType = new ProductType();
        productType.setCode(productTypeDTO.getCode());
        productType.setName(productTypeDTO.getName());
        productType.setDescription(productTypeDTO.getDescription());
        return productType;
    }
}
