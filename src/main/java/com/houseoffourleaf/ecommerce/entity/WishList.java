package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "wish_list")
public class WishList {

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

    @Column(name = "active_ind", columnDefinition = "char(1) default 'N'", nullable = false)
    private char activeInd;

}