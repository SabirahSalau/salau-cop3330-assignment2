/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex27.base;


import java.util.Scanner;

public class Solution27
{
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Solution27 app = new Solution27();
        String firstName = app.readData("Enter the first name:");
        String lastName = app.readData("Enter the last name:");
        String zip = app.readData("Enter the zipcode(numbers only):");
        String id = app.readData("Enter the employee ID (format AA-1234):");

        InputValidation validation = new InputValidation();
        String result = validation.validateInput(firstName, lastName, zip, id);

        System.out.println(result);
    }

    private String readData(String prompt)
    {
        System.out.println(prompt);
        String result = input.nextLine().toLowerCase();
        return result;
    }
}
