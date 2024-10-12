package com.vss.marketplace.application.usecases;

import com.vss.marketplace.Domain.entity.user.User;

public interface CreateUserUseCase {

    public User execute(User user);
}
