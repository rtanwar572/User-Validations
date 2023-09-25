package com.user;

import com.user.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DSource {

    @Bean
    public List<User> getUser(){
        return new ArrayList<>();
    }
}
