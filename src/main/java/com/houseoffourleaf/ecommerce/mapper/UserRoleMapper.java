package com.houseoffourleaf.ecommerce.mapper;


import com.houseoffourleaf.ecommerce.dto.UserRoleDTO;
import com.houseoffourleaf.ecommerce.entity.UserRole;

public class UserRoleMapper {

    public static UserRoleDTO toDTO(UserRole userRole) {
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        userRoleDTO.setCode(userRole.getCode());
        userRoleDTO.setName(userRole.getName());
        userRoleDTO.setDescription(userRole.getDescription());
        userRoleDTO.setActiveInd(userRole.getActiveInd());
        return userRoleDTO;
    }

    public static UserRole toEntity(UserRoleDTO userRoleDTO) {
        UserRole userRole = new UserRole();
        userRole.setCode(userRoleDTO.getCode());
        userRole.setName(userRoleDTO.getName());
        userRole.setDescription(userRoleDTO.getDescription());
        userRole.setActiveInd(userRoleDTO.getActiveInd());
        return userRole;
    }
}
