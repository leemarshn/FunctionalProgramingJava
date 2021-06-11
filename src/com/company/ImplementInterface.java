package com.company;

public class ImplementInterface implements InterfaceTest {

   public String takeCoffee(int hour){
        return "Mocha";
    }

   public String eat(String food){
       return "Spaghetti";
    }

    public static void main(String[] args) {
        InterfaceTest person = new ImplementInterface();

        //System.out.println(person.takeCoffee(34));
        //System.out.println(person.eat("rice"));


    }

}
