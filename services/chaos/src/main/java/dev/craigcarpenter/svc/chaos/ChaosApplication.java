package dev.craigcarpenter.svc.chaos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ChaosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaosApplication.class, args);
	}

}
