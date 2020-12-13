package com.mc.contextcaching.shared;

import com.mc.contextcaching.App;
import com.mc.contextcaching.UsernameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = {SharedTestConfiguration.class, App.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private UsernameService usernameService;

    @Test
    void test() {
        System.out.println(usernameService.getUsername());
    }
}