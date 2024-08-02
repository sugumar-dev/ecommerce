package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ProductMaterialDTO;
import com.houseoffourleaf.ecommerce.entity.ProductMaterial;

public class ProductMaterialMapper {

    public static ProductMaterialDTO toDTO(ProductMaterial productMaterial) {
        ProductMaterialDTO productMaterialDTO = new ProductMaterialDTO();
        productMaterialDTO.setCode(productMaterial.getCode());
        productMaterialDTO.setName(productMaterial.getName());
        productMaterialDTO.setDescription(productMaterial.getDescription());
        return productMaterialDTO;
    }

    public static ProductMaterial toEntity(ProductMaterialDTO productMaterialDTO) {
        ProductMaterial productMaterial = new ProductMaterial();
        productMaterial.setCode(productMaterialDTO.getCode());
        productMaterial.setName(productMaterialDTO.getName());
        productMaterial.setDescription(productMaterialDTO.getDescription());
        return productMaterial;
    }
}
