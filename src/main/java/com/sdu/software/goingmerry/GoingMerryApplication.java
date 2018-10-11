package com.sdu.software.goingmerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * GoingMerry启动类
 *
 * @author Lyp (mailto:Lyp@primeton.com)
 */
@SpringBootApplication
@EnableScheduling
public class GoingMerryApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(GoingMerryApplication.class);
		application.run(args);
	}
}