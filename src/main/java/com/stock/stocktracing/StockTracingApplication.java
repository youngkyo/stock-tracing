package com.stock.stocktracing;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StockTracingApplication{

	private static final String APPLICATION_LOCATIONS = "spring.config.location="
		+ "classpath:application.yml,"
		+ "/app/config/stock-tracing/real-application.yml";


	public static void main(String[] args) {
//		SpringApplication.run(StockTracingApplication.class, args);
		new SpringApplicationBuilder(StockTracingApplication.class)
			.properties(APPLICATION_LOCATIONS)
			.run(args);
	}
}
