package com.houseoffourleaf.ecommerce.exception;

public class ImageUploadException extends RuntimeException {

    private final String message;

    public ImageUploadException(String message) {
        super(message);
        this.message = message;
    }
}
