package com.j1808.service;

import com.j1808.service.impl.HystrixRemoteServiceimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provider",fallback = HystrixRemoteServiceimpl.class)
//当远程服务调用失败时回调
public interface HystrixRemoteService {

    @RequestMapping("/hello")
    public String getInfo(@RequestParam("name") String name);

}
