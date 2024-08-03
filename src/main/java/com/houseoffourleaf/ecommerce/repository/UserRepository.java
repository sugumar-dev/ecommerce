package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    Optional<Users> findByEmailId(String email);

    Optional<Users> findByUserIdAndActiveIndicator(String userId, String activeIndicator);

    Optional<Users> findByUserId(String userId);
}
