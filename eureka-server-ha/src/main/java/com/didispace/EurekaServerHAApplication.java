package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerHAApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerHAApplication.class).web(true).run(args);
	}

}
