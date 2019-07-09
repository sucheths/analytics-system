package com.sucheths.analytics.system.backend.configuration;

import com.sucheths.analytics.system.backend.filter.AnalyticsFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sucheth.shivakumar
 */
@Configuration
@EnableWebSecurity
public class AnalyticsConfiguration  extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    @Override
    protected void configure(HttpSecurity security) throws Exception
    {
        security.httpBasic().disable();
        security.cors().and().csrf().disable();
        security.addFilterAfter(new AnalyticsFilter(), FilterSecurityInterceptor.class);
    }

}
