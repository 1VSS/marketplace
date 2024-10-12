package com.vss.marketplace.infrastructure.persistence.Jpa.user;

import com.vss.marketplace.Domain.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByName(String name);

    boolean existsByEmail(String email);
}
