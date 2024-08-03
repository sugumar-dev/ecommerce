package com.houseoffourleaf.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateUserResponse {
    private String userId;
    private String emailId;
    private String message;
}
