package Limitservicemicroservice.Limitmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class LimitMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitMicroserviceApplication.class, args);
	}

}
