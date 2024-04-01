package com.placeorder.placeorder.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.placeorder.placeorder.converter.OrderConverter;

@Configuration
public class BeanConfiguration {

    @Bean
    public OrderConverter orderConverter() {
        return new OrderConverter();
    }
}
