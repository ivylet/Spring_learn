package com.taytay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMVCSupport extends WebMvcConfigurationSupport {
        @Override
        protected void addResourceHandlers(ResourceHandlerRegistry registry){
            registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
            registry.addResourceHandler("/js/**").addResourceLocations("/js/");
            registry.addResourceHandler("/css/**").addResourceLocations("/css/");
            registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
        }


}
