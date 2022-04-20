package com.example.insuliinisokeri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.insuliinisokeri.domain.Event;
import com.example.insuliinisokeri.domain.EventRepository;

@SpringBootApplication
public class InsuliinisokeriApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuliinisokeriApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(EventRepository repository) {
		return (args) -> {
			Event e1 = new Event("1.1.2022 15:20", "5.5", "7.5", "8.5");
			Event e2 = new Event("3.4.2022 16:20", "3", "9.5", "7.5");
			
			repository.save(e1);
			repository.save(e2);
		};
	}

}
