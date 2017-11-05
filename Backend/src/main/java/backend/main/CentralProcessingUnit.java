package backend.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"backend.controller", "backend.resource", "backend.entity", "backend.repository"})
public class CentralProcessingUnit {
	
	public static void main(String[] args) {
		SpringApplication.run(CentralProcessingUnit.class, args);
	}

}
