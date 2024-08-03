package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private char gender;
    private String userId;
    private String password;
    private int primaryContact;
    private Integer secondaryContact;
    private String countryCodePrimary;
    private String countryCodeSecondary;
    private LocalDate anniversaryDate;
    private LocalDateTime lastLoginTimestamp;
    private String emailId;
    private char emailVerified;
    private char activeInd;
    private char contactNumberVerified;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;
}
