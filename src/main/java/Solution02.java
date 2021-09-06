/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;
// class to contain solution02 code
public class Solution02 {

    // Creating scanner once to parse input values
    static Scanner in = new Scanner(System.in);
    // main driver method
    public static void main(String[] args) {
        Solution02 app = new Solution02();
        // initializing string objects
        // 'string' for input method
        // 'outputString' for output method
        //  all will extend 'solution02'
        String string = app.inputString();
        String outputString = app.generateOutputString(string);
        app.printOutput(outputString);



    }
    // method used to print output string to console
    // private access modifier for use only within 'Solution02'
    // taking string from 'generateOutputString()'
    // void function returns no value
    private void printOutput(String outputString) {
        System.out.println(outputString);
    }
    // method used to generate output string
    // private access modifier for use within 'solution02' class
    // taking 'name' from 'in.nextLine();' and passing it into output statement
    // returning value will be passed to 'printOutput'
    private String generateOutputString(String string) {
        int s = string.length();
        return String.format("%s has %d characters.", string, s);
    }
    // method used for reading user input
    // private access modifier to only be used within 'solution02' class
    // print statement asking for user name
    // using scanner function 'next line' to read until end of line and return value
    // returning returning value will pass through 'generateOutputString'
    private String inputString() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }
}
