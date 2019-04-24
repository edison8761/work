package com.j1808.controller;

import com.j1808.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HystrixController {
    @Autowired
    private HystrixRemoteService hystrixRemoteService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("name") String name ){

        return hystrixRemoteService.getInfo(name+"11");
    }

}
