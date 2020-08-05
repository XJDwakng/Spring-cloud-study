package com.kangdw.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class TestController {
    @Value("${data.user.username}")
    private String username;

    @Value("${data.user.password}")
    private String password;

    @Resource
    private Environment environment;

    @GetMapping("/username")
    public String getUsername() {
        return username;
    }
    @GetMapping("/password")
    public String getPassword() {
        return environment.getProperty("password");
    }
}
