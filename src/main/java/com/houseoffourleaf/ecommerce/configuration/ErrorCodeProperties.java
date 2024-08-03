package com.houseoffourleaf.ecommerce.configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Configuration
@ConfigurationProperties("error")
@Data
@Builder
public class ErrorCodeProperties {

    private Map<Integer,ErrorResponse> code;


}
