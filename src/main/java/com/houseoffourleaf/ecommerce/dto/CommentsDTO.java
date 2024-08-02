package com.houseoffourleaf.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentsDTO {

    private int id;
    private int customerId;
    private int productId;
    private LocalDate commentDate;
    private String notes;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;
    private Integer rating;

}

