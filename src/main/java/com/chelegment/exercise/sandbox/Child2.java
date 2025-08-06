package com.chelegment.exercise.sandbox;

public class Child2  extends ParentA{
    public static String name= "Child2";
    public Child2() {
        System.out.println("This is Child2");
        System.out.println(getName());
    }

    public static String getName() {
        return name;
    }
}
