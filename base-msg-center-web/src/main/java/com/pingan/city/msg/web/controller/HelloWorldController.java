package com.pingan.city.msg.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping(value = "helloWorld")
    @ResponseBody
    public Map<String, Object> helloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("sex", "男");
        return map;
    }
}
