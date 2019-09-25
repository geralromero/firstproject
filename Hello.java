package com.company;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myAge = 33 + 1;
        System.out.println(myAge);

        int mySecondNumber = 12;
        int myThirdNumber = mySecondNumber * 2;
        int myTotal = myAge + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);
    }
}
