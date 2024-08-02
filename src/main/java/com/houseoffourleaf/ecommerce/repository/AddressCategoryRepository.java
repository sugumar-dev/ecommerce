package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.AddressCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressCategoryRepository extends JpaRepository<AddressCategory, String> {

}
