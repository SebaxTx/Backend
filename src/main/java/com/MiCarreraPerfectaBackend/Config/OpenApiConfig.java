package com.MiCarreraPerfectaBackend.Config;

import org.springframework.context.annotation.*;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;

/**
 *
 * @author Cabrera
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Mi Carrera Perfecta")
                        .version("0.1")
                        .description("Api: 3ro Desarrollo de Software")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}