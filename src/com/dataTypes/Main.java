package com.dataTypes;

public class Main {

    public static void main(String[] args) {

        String myString = "Lovekesh kaushik";
//        System.out.println(myString);
        System.out.println("Hello " + myString);
        myString = myString + " , welcome to java";
        System.out.println("hello " + myString);

        //adding unicode characters

        myString = myString + " \u00A9 2021";
        System.out.println("hello " + myString);



         String myNewString = "23.33";
         myNewString = myNewString + "444";
        System.out.println(myNewString);




        String newString = "50";
        int newInt = 50;
        newString = newString + newInt;
        System.out.println("new string is " + newString);

        double myDouble = 55.55d;
        newString = newString + myDouble;
        System.out.println(newString);

        

    }
}
