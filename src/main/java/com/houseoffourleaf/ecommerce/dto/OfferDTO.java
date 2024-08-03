package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferDTO {

    private int id;
    private String code;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer discountType;
    private Double discountAmount;
    private Double discountPercentage;
    private char activeInd;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;

}
