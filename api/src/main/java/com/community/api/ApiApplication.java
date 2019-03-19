package com.community.api;

import org.broadleafcommerce.common.config.EnableBroadleafSiteRootAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Elbert Bautista (elbertbautista)
 */
@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
// @EnableAutoConfiguration
// public class ApiApplication {

//     @Configuration
//     @EnableBroadleafSiteRootAutoConfiguration
//     public static class BroadleafFrameworkConfiguration {}

//     public static void main(String[] args) {
//         SpringApplication.run(ApiApplication.class, args);
//     }
    
// }
