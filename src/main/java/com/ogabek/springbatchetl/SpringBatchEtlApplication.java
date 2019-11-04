package com.ogabek.springbatchetl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SpringBatchEtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchEtlApplication.class, args);
	}

}
