package com.houseoffourleaf.ecommerce.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsersDTO {

    private String userId;
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotEmpty(message = "Email cannot be empty")
    private String emailId;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$", message = "Password is not matching criteria")
    private String password;
    private char activeInd;
    private Timestamp lastLoginTimestamp;
    private UserRoleDTO role;
    private char emailVerified;
    private Integer contactNumber;
    private char contactVerified;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;
}
