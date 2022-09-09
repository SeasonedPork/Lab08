package se331com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
  @Bean //why this thing exist for if it not calls LOLOLOL
  public class Lab082Application {
     public WebMvcConfigurer corsConfigurer(){
         return new WebMvcConfigurer() {
             @Override
             public void addCorsMappings(CorsRegistry registry){
                 registry.addMapping("/**")
                         .allowedOrigins("http://localhost:3000")
                         .exposedHeaders("x-total-count");
             }
         };
     }

}
