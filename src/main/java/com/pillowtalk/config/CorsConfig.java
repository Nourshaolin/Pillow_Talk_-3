package com.pillowtalk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")   // allow all domains, including React's port 3000
                .allowedMethods("*")   // allow all HTTP verbs
                .allowedHeaders("*");
    }
}
