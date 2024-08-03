package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ProductCategoryDTO;
import com.houseoffourleaf.ecommerce.entity.ProductCategory;

public class ProductCategoryMapper {

    public static ProductCategoryDTO toDTO(ProductCategory productCategory) {
        ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();
        productCategoryDTO.setCode(productCategory.getCode());
        productCategoryDTO.setName(productCategory.getName());
        productCategoryDTO.setDescription(productCategory.getDescription());
        productCategoryDTO.setNewArrivals(productCategory.getNewArrivals());
        return productCategoryDTO;
    }

    public static ProductCategory toEntity(ProductCategoryDTO productCategoryDTO) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCode(productCategoryDTO.getCode());
        productCategory.setName(productCategoryDTO.getName());
        productCategory.setDescription(productCategoryDTO.getDescription());
        productCategory.setNewArrivals(productCategoryDTO.getNewArrivals());
        return productCategory;
    }
}
