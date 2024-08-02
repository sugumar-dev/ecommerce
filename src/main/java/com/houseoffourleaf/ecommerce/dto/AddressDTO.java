package com.houseoffourleaf.ecommerce.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private int id;
    private int customerId;
    private char activeInd;
    private String type;
    private String category;
    private String buildingName;
    private String houseNo;
    private String streetName;
    private String landmark;
    private String area;
    private String city;
    private String state;
    private String country;
    private int pincode;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;
}
