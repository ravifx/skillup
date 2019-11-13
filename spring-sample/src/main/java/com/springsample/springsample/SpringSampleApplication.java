package com.springsample.springsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleApplication {

	public static void main(String[] args) {
	  
	  BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
	  
	  int result = binarySearchImpl.binarySearch(new int[]{1, 2,3,4,5}, 3);
	  System.out.println("RESULT: "+result);
		SpringApplication.run(SpringSampleApplication.class, args);
	}

}
