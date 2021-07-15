package com.springdemo.springbasics.component;

import org.springframework.stereotype.Component;


public class ExpressTea implements HotDrink {

    public void prepareDrink(){
        System.out.println("Preparing ExpressTea...");
    }
}
