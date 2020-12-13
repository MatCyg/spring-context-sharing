package com.mc.contextcaching.nonshared_mockbean;

import com.mc.contextcaching.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddressControllerTest {

    @MockBean
    private AddressService addressService;

    @Test
    void test() {
        System.out.println(addressService.getAddress());
    }
}