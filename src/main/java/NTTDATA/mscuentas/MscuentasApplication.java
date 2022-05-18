package NTTDATA.mscuentas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MscuentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscuentasApplication.class, args);
	}

}
