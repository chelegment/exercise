package com.chelegment.exercise.sandbox;

public class ParentA {
    public static String name = "parentA";
    public ParentA() {
        System.out.println("This is parentA");
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

    }

    public static String getName() {
        return name;
    }
}
