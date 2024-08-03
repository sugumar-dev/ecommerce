package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.DeviceTypeDTO;
import com.houseoffourleaf.ecommerce.entity.DeviceType;

public class DeviceTypeMapper {

    public static DeviceTypeDTO toDTO(DeviceType deviceType) {
        DeviceTypeDTO deviceTypeDTO = new DeviceTypeDTO();
        deviceTypeDTO.setCode(deviceType.getCode());
        deviceTypeDTO.setName(deviceType.getName());
        deviceTypeDTO.setDescription(deviceType.getDescription());
        return deviceTypeDTO;
    }

    public static DeviceType toEntity(DeviceTypeDTO deviceTypeDTO) {
        DeviceType deviceType = new DeviceType();
        deviceType.setCode(deviceTypeDTO.getCode());
        deviceType.setName(deviceTypeDTO.getName());
        deviceType.setDescription(deviceTypeDTO.getDescription());
        return deviceType;
    }
}
