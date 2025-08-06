package com.chelegment.exercise.sandbox.coffee;

public class DrinkBuilder {
    private final Drink drink;

    public DrinkBuilder(Drink drink) {
        this.drink = drink;
    }

    public DrinkBuilder addSugar() {
        drink.setSugar(1);
        return this;
    }

    public DrinkBuilder addMilk(int ml) {
        drink.setMilk(ml);
        return this;
    }

    public DrinkBuilder addWater(int ml) {
        drink.setWater(ml);
        return this;
    }

    public Drink build() {
        return drink;
    }

}
