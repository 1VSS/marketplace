package com.vss.marketplace.infrastructure.dtos;

import com.vss.marketplace.Domain.enums.rolesEnum;

public record UserDTO(String name, String email, String password) {
}
