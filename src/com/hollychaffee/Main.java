package com.hollychaffee;

public class Main {
    // Previously worked on byte, short, int, long, float, double, char, boolean

    public static void main(String[] args) {

        // The String is a datatype in Java, which is not a primitive type. It's actually a Class,
        // but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.
        // A String is sequence of characters. In Java strings are objects.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);  // Append to the string by using the plus operator

        myString = myString + ", and another append.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "450";
        numberString = numberString.concat("29.95"); // Not using a number type so the two numbers do not "add", they are
                                               // concatenated (joined together without any gaps) in the output.
        System.out.println(numberString);

        double numberAdd;       // Changed type to a double in order to add the two numbers together.
        numberAdd = 450.0;
        numberAdd = numberAdd + 29.50;
        System.out.println(numberAdd);

        String finalString;
        finalString = "10";
        int myInt = 56;
        finalString = finalString + myInt;  // Java compiler is able to take the int data type and realize we are
                                            // trying to add it to a string. Compiler converts the value of myInt (56)
                                            // to a string and appends it to the literal string of 10.
        System.out.println("FinalString is equal to " + finalString);

        double doubleNumber = 370.45d;      // Another example of above using the double primitive type.
        finalString = finalString + doubleNumber;
        System.out.println("Final string is equal to " + finalString);

        // Above code is good practice to see how it all works, but it is an inefficient way to append values.
        // A better method would be to use the StringBuffer class.

    }
}
