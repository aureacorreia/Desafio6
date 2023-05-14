package br.edusync.com.desafio6.config;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.hibernate.internal.SessionCreationOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.security.Security;

public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    private Authentication authenticationProvider;

    @Bean
    public Security securityFilterChain(HttpHeaderSecurityFilter http) throws Exception{
        Object SessionCreationPolicy;
        http
                .csrf()
                .disable()
                .authorizedHttpRequests()
                .requestMatchers("/Login/**", "/swagger-ui", "/v3/api-docs/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagemt()
                .sessionCreationPolicy(SessionCreationPolicy.STALESS)
                .and()
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthenticationFilter, UsarnamePasswordAuthenticationFilter.class);
        return http.build();
    }




}
