package com.me.test.config;

import com.me.test.service.OrderService;
import com.me.test.service.impl.DefaultOrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public OrderService orderService() {
        return new DefaultOrderService();
    }

}
