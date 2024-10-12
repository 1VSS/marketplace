package com.vss.marketplace.infrastructure.controllers;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.application.usecases.CreateUserUseCase;
import com.vss.marketplace.infrastructure.dtos.UserDTO;
import com.vss.marketplace.infrastructure.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final UserMapper userMapper;

    public UserController(CreateUserUseCase createUserUseCase, UserMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.userMapper = userMapper;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        User newUser = createUserUseCase.execute(userMapper.toDomainObj(userDTO));
        return userMapper.toDto(newUser);
    }
}
