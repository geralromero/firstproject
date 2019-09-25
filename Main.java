package com.company;

public class Main {

    public static void main(String[] args) {

        int testValue = 1000;

        // define Max and Min value for a INTEGER data type

        int myMinIntValue = Integer.MIN_VALUE; // Wrapped class
        int myMaxIntValue = Integer.MAX_VALUE; // Wrapped class
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);

        int myMaxIntTest = 2_147_483_647;

        // Byte data type

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value = " + myMinByteValue);
        System.out.println("Max byte value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min short value = " + myMinShortValue);
        System.out.println("Max short value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min long value = " + myMinLongValue);
        System.out.println("Max long value = " + myMaxLongValue);

        // casting between data types

        byte myTestByteValue = (byte) (myMinByteValue /2);
        short myTestShortValue = (short) (myMinShortValue / 2);
        int myTestIntValue = (myMinIntValue / 2);

        // number data types

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("My float min value = " + myFloatMinValue);
        System.out.println("My float max value = " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("My double min value = " + myDoubleMinValue);
        System.out.println("My double max value = " + myDoubleMaxValue);

        int myIntValue = 5;
        float myFloatValue = 5.0f; // here we use "f" so it can be defined as float, or we have to cast
        double myDoubleValue = 5.0;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        //Converting a given number of pounds to kilograms

        double onePoundInKg = 0.45359237;
        double poundsToConvert = 150;
        double resultKg = onePoundInKg * poundsToConvert;
        System.out.println("Kg = " + resultKg);

        // primitive types

        char aChar = 'B';
        char unicodeChar = '\u0392';
        char charGreek = '\u03BB';
        System.out.println(unicodeChar);
        System.out.println(charGreek);

        boolean myTrueBoolean = true; // declare with 1
        boolean myFalseBoolean = false // declared with 0
    }

}
