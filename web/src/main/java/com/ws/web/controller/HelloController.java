package com.ws.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangshuo
 * @Date: 2019/3/20 8:37 PM
 * @Version 1.0
 */

@RestController("/hello")
public class HelloController {


    @RequestMapping(method= RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }

}
