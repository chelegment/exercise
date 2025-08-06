package com.chelegment.exercise.sandbox.coffee;

public class SimpleCoffeeMaker implements CoffeeMachine {

    @Override
    public Coffee makeCoffee() {
        return DrinkFactory.getCoffee();
    }

    @Override
    public Tea makeTea() {
        return DrinkFactory.getTea();
    }
}
