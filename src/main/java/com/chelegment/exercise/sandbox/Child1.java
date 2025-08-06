package com.chelegment.exercise.sandbox;

public class Child1 extends ParentA{
    public static String name= "Child1";
    public Child1() {
        super();
        System.out.println("This is Child1");
        System.out.println(getName());
    }

    public static String getName() {
        return name;
    }
}
