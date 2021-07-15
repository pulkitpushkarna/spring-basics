package com.springdemo.springbasics.component;

import org.springframework.stereotype.Component;

@Component
public class Tea implements  HotDrink{

   public void prepareDrink(){
        System.out.println("Preparing Tea...");
    }
}
