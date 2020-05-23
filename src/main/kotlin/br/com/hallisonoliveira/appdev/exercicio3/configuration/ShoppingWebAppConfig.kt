package br.com.hallisonoliveira.appdev.exercicio3.configuration

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableOAuth2Sso
@Configuration
class ShoppingWebAppConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()!!
            .anyRequest().permitAll()

        http.csrf().disable()
    }

}