package com.vss.marketplace.application.usecases;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.Domain.enums.rolesEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateUserUseCaseImplTest {

    User user = new User(0L, "name", "email", "12345", rolesEnum.USER);

}