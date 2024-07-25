package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.ApiEventRef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiEventRefRepository extends JpaRepository<ApiEventRef, String> {

}

