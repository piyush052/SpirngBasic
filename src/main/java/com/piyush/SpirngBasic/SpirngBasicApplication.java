package com.piyush.SpirngBasic;

import com.piyush.SpirngBasic.contextAware.AppContextAwareComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpirngBasicApplication implements CommandLineRunner {
	@Autowired
	AppContextAwareComponent appContextAwareComponent;

	public static void main(String[] args) {
		SpringApplication.run(SpirngBasicApplication.class, args);
		//ApplicationContext

	}


	@Override
	public void run(String... args) throws Exception {
		appContextAwareComponent.doSomethingRelatedToAppContext();
	}

	@GetMapping("/person")
	public void persons(){

	}
}
