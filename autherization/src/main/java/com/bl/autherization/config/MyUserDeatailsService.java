package com.bl.autherization.config;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;


import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author bl
 * @ClassName MyUserDeatailsService.java
 * @Description TODO
 * @createTime 2021年01月27日 10:16:00
 */
public class MyUserDeatailsService implements UserDetailsService {

    @Resource
    private DataSource dataSource;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUserDetails myUserDetails ;



        return null;
    }
}
