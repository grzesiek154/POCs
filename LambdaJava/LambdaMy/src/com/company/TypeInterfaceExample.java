package com.company;

public class TypeInterfaceExample {

    public static void main(String[] args) {

        StringLengthLambda myLambda = s -> s.length();
        // przy jedny parametrze s moze byc bez nawiasow (s)

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
