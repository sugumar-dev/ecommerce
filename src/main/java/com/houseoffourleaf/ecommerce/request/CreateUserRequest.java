package com.houseoffourleaf.ecommerce.request;

import com.houseoffourleaf.ecommerce.dto.UsersDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateUserRequest {

    private UsersDTO user;
}
