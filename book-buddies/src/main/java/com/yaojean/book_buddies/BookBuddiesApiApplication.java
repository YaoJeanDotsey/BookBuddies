package com.yaojean.book_buddies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookBuddiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookBuddiesApiApplication.class, args);
	}

}
