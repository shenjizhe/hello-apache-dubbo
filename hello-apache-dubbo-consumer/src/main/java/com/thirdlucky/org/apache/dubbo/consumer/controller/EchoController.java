package com.thirdlucky.org.apache.dubbo.consumer.controller;

import com.thirdlucky.org.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EchoController {

    @Value("${user.name}")
    private String username;

    @Reference(version = "1.0.0")
    private EchoService service;

    @GetMapping("echo/{text}")
    public String echo(@PathVariable("text") String text) {
        return service.echo(text) + username;
    }

}
