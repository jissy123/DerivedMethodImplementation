package com.springboot.derivedmethod;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.derivedmethod.service.DerivedMethodServiceImpl;

@SpringBootApplication
public class DerivedMethodimplementationApplication implements CommandLineRunner {
	
@Autowired	
DerivedMethodServiceImpl personService; 	

	public static void main(String[] args) {
		
		SpringApplication.run(DerivedMethodimplementationApplication.class, args);
		
	}
	

	@Override
	public void run(String... args) throws Exception {
	

		
		
	}
	


		
		
	}
	
	



