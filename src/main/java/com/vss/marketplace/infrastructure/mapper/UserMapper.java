package com.vss.marketplace.infrastructure.mapper;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.Domain.enums.rolesEnum;
import com.vss.marketplace.infrastructure.dtos.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO toDto(User user) {
        return new UserDTO(user.name(), user.email(), user.password());
    }

    public User toDomainObj(UserDTO userDTO) {
        return new User(null, userDTO.name(), userDTO.email(), userDTO.password(), rolesEnum.USER);
    }
}
