package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.UsersDTO;
import com.houseoffourleaf.ecommerce.entity.Users;

public class UserMapper {

    public static UsersDTO toDTO(Users user) {
        UsersDTO userDTO = new UsersDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setEmailId(user.getEmailId());
        userDTO.setPassword(user.getPassword());
        userDTO.setActiveInd(user.getActiveIndicator());
        userDTO.setLastLoginTimestamp(user.getLastLoginTimestamp());
        userDTO.setRole(UserRoleMapper.toDTO(user.getRole()));
        userDTO.setEmailVerified(user.getEmailVerified());
        userDTO.setContactNumber(user.getContactNumber());
        userDTO.setContactVerified(user.getContactVerified());
        userDTO.setInsertUser(user.getInsertUser());
        userDTO.setInsertTimestamp(user.getInsertTimestamp());
        userDTO.setUpdateUser(user.getUpdateUser());
        userDTO.setUpdateTimestamp(user.getUpdateTimestamp());
        return userDTO;
    }

    public static Users toEntity(UsersDTO userDTO) {
        Users user = new Users();
        user.setUserId(userDTO.getUserId());
        user.setEmailId(userDTO.getEmailId());
        user.setPassword(userDTO.getPassword());
        user.setActiveIndicator(userDTO.getActiveInd());
        user.setLastLoginTimestamp(userDTO.getLastLoginTimestamp());
        //user.setRole(userDTO.getRole());
        user.setEmailVerified(userDTO.getEmailVerified());
        user.setContactNumber(userDTO.getContactNumber());
        user.setContactVerified(userDTO.getContactVerified());
        user.setInsertUser(userDTO.getInsertUser());
        user.setInsertTimestamp(userDTO.getInsertTimestamp());
        user.setUpdateUser(userDTO.getUpdateUser());
        user.setUpdateTimestamp(userDTO.getUpdateTimestamp());
        return user;
    }
}
