package com.musicapi.musicapi.web.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    /* @Bean
     public OpenAPI baseOpenAPI(){
         return new OpenAPI().info(new Info().title("Music API V1").version("1.0.0").description("Spring Doc"));
                 
     }*/
   @Bean
    public OpenAPI baseOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Api mucisa")
                                .version("1.0.0")
                                .description("Api de canciones")
                );

    }
}
