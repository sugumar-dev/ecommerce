package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, String> {
    // Add custom query methods if needed
}
