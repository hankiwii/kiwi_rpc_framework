package com.taoqian.duty.controller;

import com.taoqian.duty.entity.Result;
import com.taoqian.duty.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网络接口层，在这里定义网络请求的路径
 */
// @RestController注解声明这是一个控制器，用于声明网络请求接口路径，并且将它注入到容器中
@RestController
// @RequestMapping注解用于声明请求的路径，这个注解既可以注解在类上面，也可以注解在方法上
@RequestMapping("/test")
public class TESTController {

    // Autowired注解，就是从Spring容器中获取一个TestService实例
    @Autowired
    private TestService testService;

    // @ResuestMapping声明请求的路径，类型面的路径和方法上的路径要拼接到一起，一次这个方法的请求路径是"/test/first"
    // method可以指定是get请求还是post或者delete put head等请求的方式，如果不指定，则模式可以接受所有的请求方式
    // @GetMapping("/first")等价于下面的声明，直接指定用Get方法请求
    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public Result test() {
        return testService.test();
    }

}
