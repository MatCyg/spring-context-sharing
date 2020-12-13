package com.mc.contextcaching.shared;

import com.mc.contextcaching.AddressService;
import com.mc.contextcaching.UsernameService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.mockito.Mockito.mock;

@TestConfiguration
class SharedTestConfiguration {

    @Bean
    UsernameService usernameService() {
        return mock(UsernameService.class);
    }

    @Bean
    AddressService addressService() {
        return mock(AddressService.class);
    }

}
