package com.springbootapplication.springboot;
import com.springbootapplication.springboot.entity.Database;
import com.springbootapplication.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.springbootapplication.springboot.entity"})
@EnableJpaRepositories(basePackages = {"com.springbootapplication.springboot.repository"})
@SpringBootApplication
public class Application {

	// Question 3.
	@Bean
	public User user() {
		User user = new User("shivangi", "12345");
		return user;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
