package com.cuscatlan.products.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger configuration class for setting up OpenAPI documentation.
 * <p>
 * This class configures the OpenAPI specification for the Cuscatlan Product Service API.
 * It provides metadata about the API, including the title, version, and description.
 * </p>
 */
@Configuration
public class SwaggerConfig {

    /**
     * Bean for OpenAPI configuration.
     * 
     * @return OpenAPI object with metadata for the Cuscatlan Product Service API.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cuscatlan Product Service API")
                        .version("1.0")
                        .description("Microservice for managing products"));
    }
}
