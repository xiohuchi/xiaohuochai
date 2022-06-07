package com.manxia.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨滨
 * @date 2022年06月07日
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {

        return "yangbin-test";
    }
}
