package com.apress.spring.LDXA;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LdxaApplication {
	@Bean
	InitializingBean saveData(LDXARepository repo) {
		return () -> {
			repo.save(new LDXA("Ты", "петух"));

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(LdxaApplication.class, args);
	}
}
