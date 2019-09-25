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
    }

}
