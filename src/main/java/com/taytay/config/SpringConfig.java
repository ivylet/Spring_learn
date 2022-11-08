package com.taytay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.taytay.service","com.taytay.dao"})
public class SpringConfig {
}
