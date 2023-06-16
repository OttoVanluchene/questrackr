package be.ottovanluchene.lifecredits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("be.ottovanluchene.lifecredits")
public class LifeCreditsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeCreditsApplication.class, args);
	}

}
