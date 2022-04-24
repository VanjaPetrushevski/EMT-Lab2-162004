package com.example.laboratoriskavtora.service;

import com.example.laboratoriskavtora.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCart createNewShoppingCart(String userId);
    List<ShoppingCart> findAllByUsername(String userId);
    ShoppingCart addNewBookToCart(Long bookId, String userId);
    ShoppingCart removeBookFromCart(Long bookId, String userId);
    ShoppingCart getActiveCart(String userId);
    ShoppingCart cancelActiveCart(String userId);
    ShoppingCart checkoutCart(String userId);
}
