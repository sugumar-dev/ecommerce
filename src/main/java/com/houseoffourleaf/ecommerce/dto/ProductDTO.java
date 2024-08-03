package com.houseoffourleaf.ecommerce.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int id;
    private String code;
    private String name;
    private String shortDescription;
    private String longDescription;
    private String specification;
    private double price;
    private char activeIndicator;
    private ProductTypeDTO productType;
    private ProductMaterialDTO productMaterial;
    private Integer totalStock;
    private Integer soldStock;
    private Integer availableStock;
    private char newArrivals;
    private ProductCategoryDTO productCategory;
    private ProductColorDTO productColor;
    private OfferDTO offer;

}
