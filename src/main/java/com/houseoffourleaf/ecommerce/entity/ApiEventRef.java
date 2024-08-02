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
@Table(name = "api_event_ref")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiEventRef {

    @Id
    @Column(name = "code", length = 25, nullable = false)
    private String code;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "active_ind", columnDefinition = "char(1)")
    private char activeInd;



}
