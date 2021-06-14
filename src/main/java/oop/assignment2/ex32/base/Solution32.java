/*
 *  UCF COP3330 Summer 2021 Assignment 31 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex32.base;
import java.util.Scanner;

public class Solution32
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int guesses = 0;
        Solution32 app = new Solution32();
        Validator check = new Validator();
        GenerateNumber randoms = new GenerateNumber();


        String difficulty = app.readInput("Enter the difficulty level (1, 2, 3):");
        String guess = app.readInput("I have my number. What's your guess?");

        boolean checker = check.validate(difficulty);
        while(!checker)
        {
            difficulty = input.next();
            checker = check.validate(difficulty);
        }

        int numberToGuess = randoms.randomNum(difficulty);

        boolean checker2 = check.validate(guess);
        while(!checker2)
        {
            guesses++;
            guess = input.next();
            checker2 = check.validate(guess);
        }

        int intGuess = Integer.parseInt(guess);

        if(intGuess < numberToGuess)
        {
            System.out.println("Too low. Guess again:");
            guesses++;
            intGuess = input.nextInt();
        }
        if(intGuess > numberToGuess)
        {
            System.out.println("Too high. Guess again:");
            guesses++;
            intGuess = input.nextInt();
        }
        if(intGuess == numberToGuess)
        {
            System.out.println("You got it in " + guesses + "!" );
        }

    }

    private String readInput(String prompt)
    {
        String result;
        System.out.println(prompt);
        result = input.next();
        return result;
    }
}
