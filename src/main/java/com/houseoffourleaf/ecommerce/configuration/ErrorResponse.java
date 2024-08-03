package com.houseoffourleaf.ecommerce.configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String id;
    private String code;
    private String title;
    private String detail;
    private HttpStatus httpStatus;
}
