package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.example.mapper")
public class DemoApplication {

        @RequestMapping("/kancolle")
        public String kancolle() {
            return "kancolle";
        }
        
        
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
