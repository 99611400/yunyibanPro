package tech.haonan.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Api(tags = "测试接口")
public class TestController {
    @GetMapping("hello")
    @ApiOperation(value = "测试hello")
    public String hello(){
        return "hello";
    }

}
