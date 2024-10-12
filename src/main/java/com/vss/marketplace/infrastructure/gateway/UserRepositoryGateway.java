package com.vss.marketplace.infrastructure.gateway;

import com.vss.marketplace.Domain.entity.user.User;
import com.vss.marketplace.Domain.gateway.UserGateway;
import com.vss.marketplace.infrastructure.mapper.UserEntityMapper;
import com.vss.marketplace.infrastructure.persistence.Jpa.user.UserEntity;
import com.vss.marketplace.infrastructure.persistence.Jpa.user.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity entity = userEntityMapper.toEntity(user);
        UserEntity newUser = userRepository.save(entity);
        return userEntityMapper.toDomainObj(newUser);
    }

    @Override
    public boolean existsByName(String name) {
        return userRepository.existsByName(name);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
