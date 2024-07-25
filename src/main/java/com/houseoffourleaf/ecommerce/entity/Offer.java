package com.houseoffourleaf.ecommerce.entity;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "discount_type")
    private Integer discountType;

    @Column(name = "discount_amount")
    private Double discountAmount;

    @Column(name = "discount_percentage")
    private Double discountPercentage;

    @Column(name = "active_ind", columnDefinition = "char(1) default 'N'")
    private char activeInd;

    @Column(name = "insert_user", nullable = false)
    private String insertUser;

    @Column(name = "insert_timestamp", nullable = false)
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_timestamp")
    private LocalDateTime updateTimestamp;
}
