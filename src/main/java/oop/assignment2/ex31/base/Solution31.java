/*
 *  UCF COP3330 Summer 2021 Assignment 31 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex31.base;
import java.util.Scanner;

public class Solution31
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution31 app = new Solution31();
        String heartRate = app.readInput("What is your resting heart rate?");
        String age = app.readInput("How old are you?");

        KarvonenHeartRate intensity = new KarvonenHeartRate();
        boolean valid = intensity.checkIncrease(age, heartRate);

    }

    private String readInput(String prompt)
    {
        String result;
        System.out.println(prompt);
        result = input.next();

        return result;
    }
}
