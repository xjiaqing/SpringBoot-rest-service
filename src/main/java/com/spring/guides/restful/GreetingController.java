package com.spring.guides.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// @RestController 是 Spring4 的新注解，此注释标记一个类为 Controller，
// 且其中的每个方法均返回一个 domain 对象而非视图，是 @Controller 和 @ResponseBody 一起使用的简写


/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 3:17 下午
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}