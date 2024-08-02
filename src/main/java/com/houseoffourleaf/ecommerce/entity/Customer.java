package com.houseoffourleaf.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "gender", nullable = false)
    private char gender;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "primary_contact", nullable = false)
    private int primaryContact;

    @Column(name = "secondary_contact")
    private Integer secondaryContact;

    @Column(name = "country_code_primary", nullable = false, columnDefinition = "varchar(5) default '+91'")
    private String countryCodePrimary;

    @Column(name = "country_code_secondary")
    private String countryCodeSecondary;

    @Column(name = "anniversary_date")
    private LocalDate anniversaryDate;

    @Column(name = "last_login_timestamp")
    private LocalDateTime lastLoginTimestamp;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "email_verified", nullable = false)
    private char emailVerified;

    @Column(name = "active_ind", nullable = false)
    private char activeInd;

    @Column(name = "contact_number_verified", nullable = false)
    private char contactNumberVerified;

    @Column(name = "insert_user", nullable = false)
    private String insertUser;

    @Column(name = "insert_timestamp", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private LocalDateTime insertTimestamp;

    @Column(name = "update_user", nullable = false)
    private String updateUser;

    @Column(name = "update_timestamp", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private LocalDateTime updateTimestamp;
}
