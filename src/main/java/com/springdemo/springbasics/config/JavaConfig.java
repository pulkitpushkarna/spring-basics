package com.springdemo.springbasics.config;


import com.springdemo.springbasics.component.ExpressTea;
import com.springdemo.springbasics.component.HotDrink;
import com.springdemo.springbasics.component.Restaurant;
import com.springdemo.springbasics.component.Tea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


//    @Bean
//    Tea tea(){
//        return new Tea();
//    }


    @Bean
    ExpressTea tea(){
        return new ExpressTea();
    }

    @Bean
    public Restaurant restaurant(HotDrink hotDrink){
        return new Restaurant(hotDrink);
    }


}
