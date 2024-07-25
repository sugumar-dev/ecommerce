package com.houseoffourleaf.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressCategoryRepository<AddressCategory> extends JpaRepository<AddressCategory, String> {

}
