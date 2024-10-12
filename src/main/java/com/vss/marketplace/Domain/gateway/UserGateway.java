package com.vss.marketplace.Domain.gateway;

import com.vss.marketplace.Domain.entity.user.User;

public interface UserGateway {

    User createUser(User user);

    boolean existsByName(String name);

    boolean existsByEmail(String email);


}
