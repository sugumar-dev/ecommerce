package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "offer_code")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfferCode {

    @Id
    @Column(name = "code", length = 25)
    private String code;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 200)
    private String description;
}
