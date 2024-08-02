package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product", referencedColumnName = "id")
    private Product product;

    @Column(name = "comment_date")
    private LocalDate commentDate;

    @Column(name = "notes", length = 600)
    private String notes;

    @Column(name = "insert_user", length = 30)
    private String insertUser;

    @Column(name = "insert_timestamp")
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user", length = 30)
    private String updateUser;

    @Column(name = "update_timestamp")
    private LocalDateTime updateTimestamp;

    @Column(name = "rating")
    private Integer rating;
}
