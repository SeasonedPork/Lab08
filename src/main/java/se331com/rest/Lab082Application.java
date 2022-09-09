package se331com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

 @SpringBootApplication
 @Bean
public WebMvcConfigurer corsConfigurer(){
     return new WebMvcConfigurer() {
         @Override
public void addCorsMappings(CorsRegistry registry){
             registry.addMapping("/event")
        .allowedOrigins("http://localhost:3000");
        }
     }
 }
public class Lab082Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab082Application.class, args);
    }

}
