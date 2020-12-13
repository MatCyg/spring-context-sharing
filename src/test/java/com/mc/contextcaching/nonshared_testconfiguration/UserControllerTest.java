package com.mc.contextcaching.nonshared_testconfiguration;

import com.mc.contextcaching.UsernameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.mockito.Mockito.mock;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @TestConfiguration
    static class UserControllerTestConfiguration {

        @Bean
        UsernameService usernameService() {
            return mock(UsernameService.class);
        }

    }

    @Autowired
    private UsernameService usernameService;

    @Test
    void test() {
        System.out.println(usernameService.getUsername());
    }
}