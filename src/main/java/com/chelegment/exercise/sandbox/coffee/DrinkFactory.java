package com.chelegment.exercise.sandbox.coffee;

public class DrinkFactory {

    public static Coffee getCoffee(){
        DrinkBuilder builder= new DrinkBuilder(new Coffee());
        return (Coffee) builder.addMilk(100)
                .addSugar()
                .addWater(100)
                .build();
    }

    public static Tea getTea(){
        DrinkBuilder builder= new DrinkBuilder(new Tea());
        return (Tea) builder.addMilk(100)
                .addSugar()
                .addWater(100)
                .build();
    }
}
