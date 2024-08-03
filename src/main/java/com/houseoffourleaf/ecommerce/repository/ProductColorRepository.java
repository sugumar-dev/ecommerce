package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductColorRepository extends JpaRepository<ProductColor, String> {

}
