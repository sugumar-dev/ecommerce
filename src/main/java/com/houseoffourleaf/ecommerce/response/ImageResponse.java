package com.houseoffourleaf.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageResponse {

    private String name;
    private String url;
    private String type;
    private long size;
    private String message;
}
