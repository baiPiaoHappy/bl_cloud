package com.bl.autherization.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;


import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * @author bl
 * @ClassName AutherizationConfig.java
 * @Description TODO
 * @createTime 2021年01月23日 16:12:00
 */
@Configuration
public class AutherizationConfig extends AuthorizationServerConfigurerAdapter {



    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

        super.configure(security);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        super.configure(clients);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        super.configure(endpoints);
    }

}
