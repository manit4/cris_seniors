package org.cris.config;

import org.cris.Tea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "org.cris")
public class ProjectConfig {
	
	public ProjectConfig() {
		System.out.println("insdie projectConfig constr");
	}
	
	@Bean
	public Tea getTea() {
		
		System.out.println("isndie getTea()...");
		
		return new Tea();
	}

}
