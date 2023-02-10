package spring.nine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.nine.API.API_Test;

@SpringBootApplication
public class NineApplication {
	public static void main(String[] args) {
		SpringApplication.run(NineApplication.class, args);
		new API_Test();
	}

}
