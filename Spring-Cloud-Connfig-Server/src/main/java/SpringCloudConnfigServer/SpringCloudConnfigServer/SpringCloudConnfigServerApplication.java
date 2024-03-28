package SpringCloudConnfigServer.SpringCloudConnfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConnfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConnfigServerApplication.class, args);
	}

}
