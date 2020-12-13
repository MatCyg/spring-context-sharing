package com.mc.contextcaching.shared;

import com.mc.contextcaching.AddressService;
import com.mc.contextcaching.App;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = {SharedTestConfiguration.class, App.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class AddressControllerTest {

    @Autowired
    private AddressService addressService;

    @Test
    void test() {
        System.out.println(addressService.getAddress());
    }
}