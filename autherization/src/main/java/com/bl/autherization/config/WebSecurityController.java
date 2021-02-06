package com.bl.autherization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author bl
 * @ClassName WebSecurityController.java
 * @Description TODO
 * @createTime 2021年01月29日 15:47:00
 */
@Configuration
public class WebSecurityController extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.oauth2Login(o ->
                o
                 .loginPage("/system/login"))
           .authorizeRequests(a ->
                   a.antMatchers("/system/login")

           );
        //super.configure(http);
    }
}
