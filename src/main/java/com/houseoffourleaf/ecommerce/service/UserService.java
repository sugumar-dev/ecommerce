package com.houseoffourleaf.ecommerce.service;

import com.houseoffourleaf.ecommerce.dto.UsersDTO;
import com.houseoffourleaf.ecommerce.entity.Users;
import com.houseoffourleaf.ecommerce.entity.UserRole;
import com.houseoffourleaf.ecommerce.repository.UserRepository;
import com.houseoffourleaf.ecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserRoleRepository userRoleRepository;

    private final AuditService auditService;

    @Autowired
    public UserService(UserRepository userRepository, UserRoleRepository userRoleRepository,
                       AuditService auditService){
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.auditService = auditService;
    }


    public boolean checkIfUserIdExist(String userId){
        return userRepository.findByUserId(userId).isPresent();
    }

    public boolean checkIfEmailIdExist(String emailId){
        return userRepository.findByEmailId(emailId).isPresent();
    }

    public void saveUser(UsersDTO userDTO) {
        Users users = new Users();
        users.setUserId(userDTO.getUserId());
        users.setEmailId(userDTO.getEmailId());
        users.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
        Optional<UserRole>  userRoleOptional = userRoleRepository.findByCode("USER");
        users.setRole(userRoleOptional.orElse(null));
        auditService.setAuditData(users, users.getUserId());
        users.setActiveIndicator('Y');
        users.setEmailVerified('N');
        users.setContactVerified('N');
        userRepository.save(users);
    }


    public Users findUserByEmail(String email) {
        return userRepository.findByEmailId(email).orElse(null);
    }
}
