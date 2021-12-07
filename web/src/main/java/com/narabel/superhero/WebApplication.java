package com.narabel.superhero;

import com.narabel.shared.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
		includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
		value={"com"}
)
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
