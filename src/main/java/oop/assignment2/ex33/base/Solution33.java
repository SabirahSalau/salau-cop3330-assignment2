/*
 *  UCF COP3330 Summer 2021 Assignment 33 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex33.base;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        int[] randNumber = new int[]{0, 1, 2, 3};
        int answer = getRandomNumber(randNumber);
        question("What's your question?");
        String response = output(answer);
        System.out.println(response);

    }

    public static void question(String prompt){
        System.out.println(prompt);
        input.nextLine();
    }

    public static int getRandomNumber(int[] answerNumber)
    {
        int answer = new Random().nextInt(answerNumber.length);
        return answerNumber[answer];
    }

    public static String output(int answer){
        String output = "";
        switch (answer){
            case 0:
                output = ("Yes.");
                break;
            case 1:
                output = ("No.");
                break;
            case 2:
                output = ("Maybe.");
                break;
            case 3:
                output = ("Ask again later.");
                break;
        }

        return output;
    }
}
