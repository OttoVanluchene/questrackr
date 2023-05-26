package be.ottovanluchene.questrackr.questrackr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("be.ottovanluchene.questrackr")
public class QuestrackrApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestrackrApplication.class, args);
	}

}
