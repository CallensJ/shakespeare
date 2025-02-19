//https://www.youtube.com/watch?v=31KTdfRH6nY&t=2709s
package dev.team.shakespear;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShakespearApplication {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ShakespearApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ShakespearApplication.class, args);
		log.info("something change!");
	}

	// test api fake data

@Bean
CommandLineRunner runner(){
	return args -> {
		String author;
				Book run = new Book(id: 1, title:"lotr", author:"Tolkien", publishedYear: 1954, price: 18.95);

	};
}

}