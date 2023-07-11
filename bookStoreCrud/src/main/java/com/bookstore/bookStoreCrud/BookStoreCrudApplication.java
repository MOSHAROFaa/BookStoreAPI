package com.bookstore.bookStoreCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bookstore.bookStoreCrud")
public class BookStoreCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreCrudApplication.class, args);
	}

}
