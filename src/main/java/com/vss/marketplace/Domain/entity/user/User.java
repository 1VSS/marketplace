package com.vss.marketplace.Domain.entity.user;

import com.vss.marketplace.Domain.enums.rolesEnum;

public record User(Long id, String name, String email, String password, rolesEnum role) {

    public boolean passwordIsValid() {
        return password != null && password.length() > 5;
    }

}
