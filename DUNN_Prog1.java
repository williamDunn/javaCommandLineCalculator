/*
Source: JCalc.java
Author: William Dunn

Purpose: To calculate and return values based on user input

October 2, 2017
 */

import java.util.Scanner;

public class JCalc {

    public static void main(String[] args)
    {
        id();
        Usage();

        /////////////////////////////////////////////////////

        String operation = args[0];
        try{
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);
        }
        catch(Exception e){
            System.err.println("***ERROR: One of operators are not a valid integer");
        double total = 0;

        ////////////////////////////////////////////////////

        switch(operation)
        {
        case "add":
            total = num1 + num2;
        break;

        case "sub":
            total = num1 - num2;
        break;

        case "mul":
            total = num1 * num2;
        break;

        case "div":
            if(num1 || num2 = 0)
                System.err.println("***ERROR: cannot divide by 0");
            else{
                total = num1 / num2;
            }
        break;

        default:
            System.err.println("***ERROR: Invalid Operation");
        }
        /////////////////////////////////////////////////////

        if(args.length != 2)
            System.err.println("***ERROR: Invalid number of operation");
        else
        {
        System.out.print(total);
        }

        /////////////////////////////////////////////////////

    private staic void Usage()
    //short usage information for the program
    {
        System.err.println("*** ERROR: Program requires 3 command line options:\n");
        System.err.println("Usage: JCalc add|sub|mul|div num1 num2");
    }

        /////////////////////////////////////////////////////

    private static void id()
    //identifies the program and author
    {
        System.out.println("JCalc, William Dunn: Somehow works");
    }
}

