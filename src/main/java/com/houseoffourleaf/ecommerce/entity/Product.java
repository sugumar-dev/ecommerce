package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Audit{

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_type")
    private ProductType productType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_material")
    private ProductMaterial productMaterial;

    @Column(name = "total_stock")
    private Integer totalStock;

    @Column(name = "sold_stock")
    private Integer soldStock;

    @Column(name = "available_stock")
    private Integer availableStock;

    @Column(name = "new_arrivals")
    private char newArrivals;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_category")
    private ProductCategory productCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_color")
    private ProductColor productColor;

    @ManyToOne(fetch = FetchType.EAGER)
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
