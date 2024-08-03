package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.ImageDTO;
import com.houseoffourleaf.ecommerce.entity.Image;

public class ImageMapper {

    public static ImageDTO toDTO(Image image) {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setUuid(image.getUuid());
        imageDTO.setProduct(ProductMapper.toDto(image.getProduct()));
        imageDTO.setData(image.getData());
        imageDTO.setFilename(image.getFilename());
        imageDTO.setFormat(image.getFormat());
        imageDTO.setDevice(DeviceTypeMapper.toDTO(image.getDevice()));
        imageDTO.setOrder(image.getOrder());
        imageDTO.setActiveInd(image.getActiveInd());
        imageDTO.setInsertUser(image.getInsertUser());
        imageDTO.setInsertTimestamp(image.getInsertTimestamp());
        imageDTO.setUpdateUser(image.getUpdateUser());
        imageDTO.setUpdateTimestamp(image.getUpdateTimestamp());
        return imageDTO;
    }

    public static Image toEntity(ImageDTO imageDTO) {
        Image image = new Image();
        image.setUuid(imageDTO.getUuid());
      //  image.setProductId(imageDTO.getProductId());
        image.setData(imageDTO.getData());
        image.setOrder(imageDTO.getOrder());
        image.setActiveInd(imageDTO.getActiveInd());
        image.setInsertUser(imageDTO.getInsertUser());
        image.setInsertTimestamp(imageDTO.getInsertTimestamp());
        image.setUpdateUser(imageDTO.getUpdateUser());
        image.setUpdateTimestamp(imageDTO.getUpdateTimestamp());
        return image;
    }
}
