package com.baeldung.spring.configuration;

import com.baeldung.spring.aspect.SpringTestAspect;
import com.baeldung.spring.service.SpringSuperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public SpringSuperService springSuperService() {
        return new SpringSuperService();
    }

    @Bean
    public SpringTestAspect springTestAspect(){
        return new SpringTestAspect();
    }
}
