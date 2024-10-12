package com.vss.marketplace.application.usecases;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.Domain.gateway.UserGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

public class CreateUserUseCaseImpl implements CreateUserUseCase{

    private final UserGateway userGateway;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        if (userGateway.existsByEmail(user.email())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already exists");
        }
        if (userGateway.existsByName(user.name())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Username already exists");
        }
        if (!user.passwordIsValid()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Password must have more than 5 characters.");
        }

        return userGateway.createUser(user);
    }
}
