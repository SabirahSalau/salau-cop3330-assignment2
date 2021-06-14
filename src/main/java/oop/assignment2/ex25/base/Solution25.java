/*
 *  UCF COP3330 Summer 2021 Assignment 25 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex25.base;
import java.util.Scanner;

public class Solution25
{
    private static final Scanner input = new Scanner(System.in);

    public static String evaluateStrength(int result, String password)
    {
        String evaluation = null;
        switch(result)
        {
            case 1:
                evaluation = ("The password \'" + password + "\' is a very weak password.");
                break;

            case 2:
                evaluation = ("The password \'" + password + "\' is a weak password.");
                break;

            case 3:
                evaluation = ("The password \'" + password + "\' is a strong password.");
                break;

            case 4:
                evaluation = ("The password \'" + password + "\' is a very strong password.");

        }

        return evaluation;
    }

    public static void main(String[] args)
    {
        Solution25 app = new Solution25();
        PasswordStrength strengthChecker = new PasswordStrength();

        System.out.println("Enter a password:");
        String password = input.nextLine();

        int result = strengthChecker.passwordValidator(password);

        String evaluation = evaluateStrength(result, password);
        System.out.println(evaluation);
    }
}
