package com.example.crudoperationwithmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * The type Crudoperationwithmongo application.
 */
@SpringBootApplication


public class CrudoperationwithmongoApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CrudoperationwithmongoApplication.class, args);
	}

}
