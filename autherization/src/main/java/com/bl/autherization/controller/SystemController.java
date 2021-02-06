package com.bl.autherization.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bl
 * @ClassName SystemController.java
 * @Description TODO
 * @createTime 2021年01月29日 15:58:00
 */
@Controller
@RequestMapping("system")
@Api("system")
public class SystemController {

    @ApiOperation(value ="",notes = "登录页")
    @GetMapping("login")
    public String loginPage(){
        return "public/login";
    }
}
