package com.stanroy.kotlinspring.config

import org.springframework.context.annotation.Profile
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.stereotype.Component

@Component
@Profile("non-secure")
class SecurityConfigurationNonSecure : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()?.antMatchers("/")?.permitAll()
        http?.authorizeRequests()?.antMatchers("/blog")?.permitAll()
    }
}

//@Component
//@Profile("secure")
//class SecurityConfigurationSecure : WebSecurityConfigurerAdapter() {
//
//    override fun configure(http: HttpSecurity?) {
//        super.configure(http)
//    }
//}