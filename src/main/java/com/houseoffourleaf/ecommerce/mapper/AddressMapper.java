package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.AddressDTO;
import com.houseoffourleaf.ecommerce.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressDTO mapToDto(Address address) {
        AddressDTO addressDto = new AddressDTO();
        addressDto.setId(address.getId());
        addressDto.setCustomerId(address.getCustomer().getId());
        addressDto.setActiveInd(address.getActiveInd());
        addressDto.setType(address.getType());
        addressDto.setCategory(address.getCategory());
        addressDto.setBuildingName(address.getBuildingName());
        addressDto.setHouseNo(address.getHouseNo());
        addressDto.setStreetName(address.getStreetName());
        addressDto.setLandmark(address.getLandmark());
        addressDto.setArea(address.getArea());
        addressDto.setCity(address.getCity());
        addressDto.setState(address.getState());
        addressDto.setCountry(address.getCountry());
        addressDto.setPincode(address.getPincode());
        addressDto.setInsertUser(address.getInsertUser());
        addressDto.setInsertTimestamp(address.getInsertTimestamp());
        addressDto.setUpdateUser(address.getUpdateUser());
        addressDto.setUpdateTimestamp(address.getUpdateTimestamp());
        return addressDto;
    }

}

