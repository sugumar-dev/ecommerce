package com.houseoffourleaf.ecommerce.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDTO {

    private String code;
    private String name;
    private String description;
    private char activeInd;

}
