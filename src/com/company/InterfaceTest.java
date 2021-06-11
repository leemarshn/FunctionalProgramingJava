package com.company;

import java.time.LocalDateTime;

public interface InterfaceTest {
    public abstract  String takeCoffee(int hour);

    default String eat(String food){
        return food;
    }

    private LocalDateTime getTime(LocalDateTime tm){

        return tm;

    }

    static int number(){
        return 0;
    }
}
