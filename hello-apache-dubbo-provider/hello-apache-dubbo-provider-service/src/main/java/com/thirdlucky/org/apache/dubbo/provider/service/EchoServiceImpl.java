package com.thirdlucky.org.apache.dubbo.provider.service;


import com.thirdlucky.org.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String echo) {
        return "Echo hello " + echo;
    }
}
