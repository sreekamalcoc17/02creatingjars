package com.revature.simple01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result is : " +checkIfInputIsAnEvenNumber(121)); // Testing in the main method
    }
    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}