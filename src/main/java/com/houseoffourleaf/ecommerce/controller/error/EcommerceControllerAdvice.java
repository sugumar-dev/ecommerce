package com.houseoffourleaf.ecommerce.controller.error;

import com.houseoffourleaf.ecommerce.configuration.ErrorCodeProperties;
import com.houseoffourleaf.ecommerce.configuration.ErrorResponse;
import com.houseoffourleaf.ecommerce.exception.EmailAlreadyExistException;
import com.houseoffourleaf.ecommerce.exception.UserAlreadyExistException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class EcommerceControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(EcommerceControllerAdvice.class);

    private final ErrorCodeProperties errorCodeProperties;

    @Autowired
    public EcommerceControllerAdvice(ErrorCodeProperties errorCodeProperties){
        this.errorCodeProperties = errorCodeProperties;
    }

    @ExceptionHandler(UserAlreadyExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleUserExistException(final HttpServletRequest httpServletRequest, final UserAlreadyExistException exception){
        LOGGER.error("Logging Exception details ", exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapBadRequestResponse(exception.getMessage(), errorCodeProperties));
    }

    @ExceptionHandler(EmailAlreadyExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleEmailExistException(final HttpServletRequest httpServletRequest, final EmailAlreadyExistException exception){
        LOGGER.error("Logging Exception details ", exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapBadRequestResponse(exception.getMessage(), errorCodeProperties));
    }

    private ErrorResponse mapBadRequestResponse(String errorMessage, ErrorCodeProperties errorCodeProperties) {
        return buildError(errorMessage, errorCodeProperties.getCode().get(1000));
    }

    private ErrorResponse buildError(String errorMessage, ErrorResponse errorResponse) {
       return ErrorResponse.builder()
                .detail(errorMessage)
                .code(errorResponse.getCode())
                .title(errorResponse.getTitle())
                .httpStatus(errorResponse.getHttpStatus())
                .build();
    }

}
