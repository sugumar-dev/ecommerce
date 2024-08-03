package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType, String> {
}
