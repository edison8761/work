package com.j1808.service.impl;

import com.j1808.service.HystrixRemoteService;
import org.springframework.stereotype.Service;

@Service
public class HystrixRemoteServiceimpl implements HystrixRemoteService {
    @Override
    public String getInfo(String name) {
        return "wellcome feign hystrix";
    }
}
