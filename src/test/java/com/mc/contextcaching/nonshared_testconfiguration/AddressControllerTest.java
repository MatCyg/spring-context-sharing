package com.mc.contextcaching.nonshared_testconfiguration;

import com.mc.contextcaching.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.mockito.Mockito.mock;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddressControllerTest {

    @TestConfiguration
    static class AddressControllerTestConfiguration {

        @Bean
        AddressService addressService() {
            return mock(AddressService.class);
        }

    }

    @Autowired
    private AddressService addressService;

    @Test
    void test() {
        System.out.println(addressService.getAddress());
    }
}