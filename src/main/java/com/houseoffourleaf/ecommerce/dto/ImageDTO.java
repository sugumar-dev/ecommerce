package com.houseoffourleaf.ecommerce.dto;

import com.houseoffourleaf.ecommerce.entity.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO {

    private UUID uuid;
    private ProductDTO product;
    private byte[] data;
    private String filename;
    private String format;
    private Integer order;
    private DeviceTypeDTO device;
    private char activeInd;
    private String insertUser;
    private LocalDateTime insertTimestamp;
    private String updateUser;
    private LocalDateTime updateTimestamp;
}
