package com.chelegment.exercise;

class Temp
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    int Temp()
    {
        // calls constructor 2
//        this(5);
        System.out.println("The Default constructor");
        return 5;
    }

    // parameterized constructor 2
//    Temp(int x)
//    {
//        // calls constructor 3
//        this(5, 15);
//        System.out.println(x);
//    }

    // parameterized constructor 3
//    Temp(int x, int y)
//    {
//        System.out.println(x * y);
//    }

    public String reverseWords(String s) {

        String [] words = s.split("/s");

        String result = "";
        char t;
        for(int i = 0;i<words.length;i++){
            char [] temp=words[i].toCharArray();
            for(int j = 0; j < words[i].length() ;j++){


                t = temp[j];
                temp[j] =  temp[temp.length-j-1];
                temp[temp.length-j-1] = t;


            }
            result+=new String(temp) + " ";
        }
        return  result.trim();
    }

    public static void main(String args[])
    {
        String s;
        s.split("\s")
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // invokes default constructor first
        new Temp();
    }
}

