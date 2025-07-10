package com.pod2.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication

// @CrossOrigin(origins = "http://127.0.0.1:5500/*")
public class EcommerceApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(EcommerceApplication.class, args);
		System.out.println("Hello app is being executed...!");
	}

	// @Override
	// public void run(String... args) throws Exception {
		
	// }

}
