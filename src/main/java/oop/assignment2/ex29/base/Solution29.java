/*
 *  UCF COP3330 Summer 2021 Assignment 29 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex29.base;


import java.util.Scanner;

public class Solution29
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution29 app = new Solution29();
        HandleBadInput validate = new HandleBadInput();

        String r = app.readInput("What is the rate of return?");
        boolean checker = validate.checkInput(r);
        while(!checker)
        {
            r = input.next();
            checker = validate.checkInput(r);
        }
        int ror = Integer.parseInt(r);
        int years = 72 / ror;

        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    private String readInput(String prompt)
    {
        String result;
        System.out.println(prompt);
        result = input.next();
        return result;
    }
}
