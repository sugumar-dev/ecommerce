package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.ProductMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMaterialRepository extends JpaRepository<ProductMaterial, String> {

}
