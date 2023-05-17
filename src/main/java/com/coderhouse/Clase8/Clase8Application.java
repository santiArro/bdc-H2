package com.coderhouse.Clase8;

import com.coderhouse.Clase8.model.Product;
import com.coderhouse.Clase8.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase8Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Clase8Application.class, args);}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Servele Listening on. http://localhost:8080/h2-console");



	}
}
