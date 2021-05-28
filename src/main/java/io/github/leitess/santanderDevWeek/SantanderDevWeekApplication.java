package io.github.leitess.santanderDevWeek;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SantanderDevWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeekApplication.class, args);
	}

	public OpenAPI customOpenAPI(@Value("${application.title}") String title, @Value("${application.version}") String version) {
		return new OpenAPI().info(new Info()
				.title(title)
				.version(version)
				.termsOfService("htt://swagger.io/terms")
				.license(new License().name("Apache 2.0")
				.url("http://springdoc.org")));
	}

}
