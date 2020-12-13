package com.mc.contextcaching.nonshared_mockbean;

import com.mc.contextcaching.UsernameService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @MockBean
    private UsernameService usernameService;

    @Test
    void test() {
        System.out.println(usernameService.getUsername());
    }
}