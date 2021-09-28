package com.sana.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class PropertyConfig {
	
	@Value("${user.name}")
	private Integer userName;

}
