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
@Table(name = "address_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressCategory {

    @Id
    @Column(name = "code", length = 25, nullable = false)
    private String code;

    @Column(name = "name", length = 10, nullable = false)
    private String name;

    @Column(name = "active_ind", columnDefinition = "char(1) default 'N'", nullable = false)
    private char activeInd;
}
