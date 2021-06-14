/*
 *  UCF COP3330 Summer 2021 Assignment 26 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex26.base;


import java.util.Scanner;

public class Solution26
{
    Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Solution26 app = new Solution26();
        double balance = app.readValues("What is your balance?");
        double APR = app.readValues("What is the APR on the card (as a percent)?");
        double monthlyPayment = app.readValues("What is the monthly payment you can make?");

        PaymentCalculator paymentCalculator = new PaymentCalculator();

        double monthsLeft = paymentCalculator.calculateMonthsUntilPaidOff(balance, APR, monthlyPayment);


        System.out.printf("It will take you %f months to pay off this card.", monthsLeft);

    }

    private double readValues(String prompt)
    {
        System.out.println(prompt);
        double result = input.nextDouble();
        return result;
    }


}
