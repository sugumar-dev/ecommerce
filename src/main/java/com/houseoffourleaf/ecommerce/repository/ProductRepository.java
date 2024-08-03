package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByActiveIndicator(Character activeIndicator);

    Optional<Product> findByCode(String productCode);

    Optional<Product> findByActiveIndicatorAndCode(char activeIndicator, String code);
}
