package com.sdu.software.goingmerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * GoingMerry启动类
 *
 * @author Lyp (mailto:Lyp@primeton.com)
 */
@SpringBootApplication
@EnableSwagger2
@EnableScheduling
public class GoingMerryApplication {
	public static void main(String[] args) {
		SpringApplication.run(GoingMerryApplication.class, args);
	}
}