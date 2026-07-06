package com.ecommerce.project.service;

import com.ecommerce.project.payload.CartDTO;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    @Override
    public CartDTO addProductToCart(Long productId, Integer quantity) {
        // Find existing cart or create one
        // Retrieve the product details
        // Perform validations
        // Create cart Item
        // Save Cart Item
        // Return Updated cart
        return null;
    }
}
