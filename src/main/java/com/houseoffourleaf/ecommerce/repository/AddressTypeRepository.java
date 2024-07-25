package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressTypeRepository extends JpaRepository<AddressType, String> {
}
