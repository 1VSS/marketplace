package com.vss.marketplace.infrastructure.mapper;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.Domain.enums.rolesEnum;
import com.vss.marketplace.infrastructure.persistence.Jpa.user.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(user.id(), user.name(), user.email(), user.password(), rolesEnum.USER);
    }

    public User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), userEntity.getPassword(), rolesEnum.USER);
    }

}
