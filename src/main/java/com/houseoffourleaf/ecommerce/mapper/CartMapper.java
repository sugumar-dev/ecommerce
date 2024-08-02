package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.CartDTO;
import com.houseoffourleaf.ecommerce.entity.Cart;

public class CartMapper {

    public static CartDTO toDto(Cart cart) {
        CartDTO cartDto = new CartDTO();
        cartDto.setId(cart.getId());
        cartDto.setProductId(cart.getProduct().getId());
        cartDto.setQuantity(cart.getQuantity());
        cartDto.setCustomerId(cart.getCustomer().getId());
        return cartDto;
    }

    public static Cart toEntity(CartDTO cartDto) {
        Cart cart = new Cart();
        cart.setId(cartDto.getId());
        // Assuming you have a service to fetch the actual Product and Customer entities
        // based on their IDs, you can set them here.
        // cart.setProduct(productService.findById(cartDTO.getProductId()));
        // cart.setCustomer(customerService.findById(cartDTO.getCustomerId()));
        cart.setQuantity(cartDto.getQuantity());
        return cart;
    }
}
