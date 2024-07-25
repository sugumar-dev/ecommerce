package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "short_desc")
    private String shortDescription;

    @Column(name = "long_desc")
    private String longDescription;

    @Column(name = "specification", length = 4000)
    private String specification;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "active_ind")
    private char activeIndicator;

    @Column(name = "image_url", columnDefinition = "varchar[]")
    private String[] imageUrl; // Assuming image URLs are stored as an array

    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_material")
    private String productMaterial;

    @Column(name = "total_stock")
    private Integer totalStock;

    @Column(name = "sold_stock")
    private Integer soldStock;

    @Column(name = "available_stock")
    private Integer availableStock;

    @Column(name = "new_arrivals")
    private char newArrivals;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_color")
    private String productColor;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @Column(name = "insert_user", nullable = false)
    private String insertUser;

    @Column(name = "insert_timestamp")
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_timestamp")
    private LocalDateTime updateTimestamp;

}
