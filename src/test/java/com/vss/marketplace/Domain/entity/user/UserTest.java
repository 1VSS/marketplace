package com.vss.marketplace.Domain.entity.user;

import com.vss.marketplace.Domain.enums.rolesEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void should_return_error_when_password_is_less_than_five_characters() {
        User user = new User(0L, "name", "email", "123", rolesEnum.USER);
        assertFalse(user.passwordIsValid());
    }

}