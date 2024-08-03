package com.houseoffourleaf.ecommerce.repository;

import com.houseoffourleaf.ecommerce.entity.Image;
import com.houseoffourleaf.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.stream.Stream;

@Repository
public interface ImageRepository extends JpaRepository<Image, UUID> {

    Stream<Image> findAllByProduct(Product product);
}
