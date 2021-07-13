package com.springdemo.springbasics;

import com.springdemo.springbasics.component.Restaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {


	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
		Restaurant restaurant = applicationContext.getBean(Restaurant.class);
		restaurant.hotDrink.prepareDrink();
	}

}
