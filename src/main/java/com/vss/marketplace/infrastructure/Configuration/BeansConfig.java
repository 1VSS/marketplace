package com.vss.marketplace.infrastructure.Configuration;

import com.vss.marketplace.Domain.gateway.UserGateway;
import com.vss.marketplace.application.usecases.CreateUserUseCase;
import com.vss.marketplace.application.usecases.CreateUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCaseImpl(userGateway);
    }
}
