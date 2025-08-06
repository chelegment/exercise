package com.chelegment.exercise.sandbox.coffee;

public class Coffee implements Drink{
    int water;
    int milk;
    int sugar;


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

   public class  CoffeeBuilder {
        private Coffee coffee = new Coffee();
        public  CoffeeBuilder addSugar() {
            coffee.sugar++;
            return this;
        }

        public CoffeeBuilder addMilk(int ml) {
            coffee.setMilk(ml);
            return this;
        }

        public CoffeeBuilder addWater(int ml) {
            coffee.setWater(ml);
            return this;
        }

        public Coffee build() {
            return coffee;
        }
    }
}
