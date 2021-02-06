package com.bl.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bl
 * @ClassName RescoureController.java
 * @Description TODO
 * @createTime 2021年01月20日 11:49:00
 */
@RestController
@RequestMapping("resource")
public class RescoureController {

    @GetMapping("get/{str}")
    public String getResource(@PathVariable String str){
        return "你好"+str+"!我是资源，恭喜你!请求成功!开始下一步吧";
    }

}
