package bts.product.product_service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI springAppOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Technical Test BTS.ID")
						.description("RESTful API For Product Service")
						.version("v0.0.1")
						.license(new License().name("For Internal Use Only").url("-")))
				.externalDocs(new ExternalDocumentation()
						.description("Spring Boot Documentation")
						.url("-"));
	}
}