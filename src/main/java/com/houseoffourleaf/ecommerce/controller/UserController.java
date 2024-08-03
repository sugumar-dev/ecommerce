package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.dto.UsersDTO;
import com.houseoffourleaf.ecommerce.exception.EmailAlreadyExistException;
import com.houseoffourleaf.ecommerce.exception.UserAlreadyExistException;
import com.houseoffourleaf.ecommerce.request.CreateUserRequest;
import com.houseoffourleaf.ecommerce.response.CreateUserResponse;
import com.houseoffourleaf.ecommerce.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class.getName());

    private final UserService userService;

    @Autowired
    public UserController (UserService userService){
        this.userService=userService;
    }

    @PostMapping(value = "/sign-up")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CreateUserResponse> userSignUp(@Valid  @RequestBody CreateUserRequest createUserRequest) throws Exception {
        UsersDTO usersDTO = createUserRequest.getUser();
        log.info("Sign Up is in progress "+usersDTO.getUserId());
       if(userService.checkIfUserIdExist(createUserRequest.getUser().getUserId())){
           log.log(Level.SEVERE,() -> "UserId already exist " +usersDTO.getUserId());
           throw new UserAlreadyExistException("UserId already exist "+usersDTO.getUserId());
       }
        if(userService.checkIfEmailIdExist(createUserRequest.getUser().getEmailId())){
            log.log(Level.SEVERE,() -> "EmailId already exist" +usersDTO.getEmailId());
            throw new EmailAlreadyExistException("EmailId already exist "+usersDTO.getEmailId());
        }
        userService.saveUser(createUserRequest.getUser());
        return ResponseEntity.ok(new CreateUserResponse(usersDTO.getUserId(), usersDTO.getEmailId(), "User created successfully!"));
    }


}
