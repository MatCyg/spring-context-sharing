package com.mc.contextcaching;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserController {

    private final UsernameService usernameService;

    @GetMapping
    String getUsername() {
        return usernameService.getUsername();
    }

}
