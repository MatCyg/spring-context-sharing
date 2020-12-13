package com.mc.contextcaching;

import org.springframework.stereotype.Service;

@Service
public class UsernameService {

    public String getUsername() {
        return "username";
    }

}
