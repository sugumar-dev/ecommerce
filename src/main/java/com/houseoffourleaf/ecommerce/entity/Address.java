package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Column(name = "active_ind", columnDefinition = "char(1) default 'N'", nullable = false)
    private char activeInd;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "building_name", length = 100)
    private String buildingName;

    @Column(name = "house_no", length = 10)
    private String houseNo;

    @Column(name = "street_name", length = 100)
    private String streetName;

    @Column(name = "landmark", length = 100)
    private String landmark;

    @Column(name = "area", length = 100)
    private String area;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "state", length = 50, nullable = false)
    private String state;

    @Column(name = "country", length = 30, nullable = false)
    private String country;

    @Column(name = "pincode", nullable = false)
    private int pincode;

    @Column(name = "insert_user", length = 50, nullable = false)
    private String insertUser;

    @Column(name = "insert_timestamp", nullable = false)
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user", length = 50, nullable = false)
    private String updateUser;

    @Column(name = "update_timestamp", nullable = false)
    private LocalDateTime updateTimestamp;


}
