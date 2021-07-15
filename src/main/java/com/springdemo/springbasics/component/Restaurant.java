package com.springdemo.springbasics.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service -> Business logic
//@Repository -> Db related calls
//@Controller -> Web request and response
public class Restaurant {

    @Autowired
    public HotDrink hotDrink;

    public Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
