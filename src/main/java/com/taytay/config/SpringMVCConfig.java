package com.taytay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.xml.ws.WebServiceException;

@Configuration
@ComponentScan({"com.taytay.controller","com.taytay.config"})
@EnableWebMvc
public class SpringMVCConfig  {

}
