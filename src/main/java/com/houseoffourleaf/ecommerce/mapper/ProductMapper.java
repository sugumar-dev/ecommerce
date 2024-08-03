package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import com.houseoffourleaf.ecommerce.entity.Product;

public class ProductMapper {

    public static ProductDTO toDto(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setCode(product.getCode());
        productDTO.setName(product.getName());
        productDTO.setShortDescription(product.getShortDescription());
        productDTO.setLongDescription(product.getLongDescription());
        productDTO.setSpecification(product.getSpecification());
        productDTO.setPrice(product.getPrice());
        productDTO.setActiveIndicator(product.getActiveIndicator());
        productDTO.setProductType(product.getProductType()!=null? ProductTypeMapper.toDTO(product.getProductType()):null);
        productDTO.setProductMaterial(product.getProductMaterial()!=null? ProductMaterialMapper.toDTO(product.getProductMaterial()):null);
        productDTO.setTotalStock(product.getTotalStock());
        productDTO.setSoldStock(product.getSoldStock());
        productDTO.setAvailableStock(product.getAvailableStock());
        productDTO.setNewArrivals(product.getNewArrivals());
        productDTO.setProductCategory(product.getProductCategory()!=null? ProductCategoryMapper.toDTO(product.getProductCategory()):null);
        productDTO.setProductColor(product.getProductColor()!=null? ProductColorMapper.toDTO(product.getProductColor()):null);
        productDTO.setOffer(product.getOffer()!=null? OfferMapper.toDTO(product.getOffer()):null); // Assuming you have an Offer ID in the DTO
        return productDTO;
    }

    public static Product toEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setCode(productDTO.getCode());
        product.setName(productDTO.getName());
        product.setShortDescription(productDTO.getShortDescription());
        product.setLongDescription(productDTO.getLongDescription());
        product.setSpecification(productDTO.getSpecification());
        product.setPrice(productDTO.getPrice());
        product.setActiveIndicator(productDTO.getActiveIndicator());
      //  product.setProductType(productDTO.getProductType());
        product.setProductMaterial(ProductMaterialMapper.toEntity(productDTO.getProductMaterial()));
        product.setTotalStock(productDTO.getTotalStock());
        product.setSoldStock(productDTO.getSoldStock());
        product.setAvailableStock(productDTO.getAvailableStock());
        product.setNewArrivals(productDTO.getNewArrivals());
       // product.setProductCategory(productDTO.getProductCategory());
       // product.setProductColor(productDTO.getProductColor());
        // Assuming you have a service to fetch the actual Offer entity based on the Offer ID
        // product.setOffer(offerService.findById(productDTO.getOfferId()));
        return product;
    }
}
