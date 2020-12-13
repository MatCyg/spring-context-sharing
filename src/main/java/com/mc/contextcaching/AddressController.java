package com.mc.contextcaching;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
class AddressController {

    private final AddressService addressService;

    @GetMapping
    String getAddress() {
        return addressService.getAddress();
    }

}
