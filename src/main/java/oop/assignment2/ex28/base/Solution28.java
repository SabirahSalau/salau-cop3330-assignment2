/*
 *  UCF COP3330 Summer 2021 Assignment 28 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex28.base;
import java.util.Scanner;

public class Solution28
{
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Solution28 app = new Solution28();
        double[] numArr = new double[5];
        for(int i = 0; i < 5; i++)
        {
            numArr[i] = readNumbers("Enter a number:");
        }
        AdditionCalculator add = new AdditionCalculator();
        double result = add.addNumbers(numArr);

        System.out.printf("The total is %.0f.", result);
    }

    public static double readNumbers(String prompt)
    {
        double result = 0;
        System.out.println(prompt);
        result = input.nextDouble();
        return result;
    }
}
