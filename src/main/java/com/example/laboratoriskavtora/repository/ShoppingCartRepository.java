package com.example.laboratoriskavtora.repository;

import com.example.laboratoriskavtora.model.ShoppingCart;
import com.example.laboratoriskavtora.model.enumerations.CartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByUserUsernameAndStatus(String username, CartStatus status);
    boolean existsByUserUsernameAndStatus(String username, CartStatus status);
    ShoppingCart findAllByUserUsername(String username);
}
