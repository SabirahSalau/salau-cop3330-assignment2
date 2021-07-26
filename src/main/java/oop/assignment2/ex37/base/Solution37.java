/*
 *  UCF COP3330 Summer 2021 Assignment 37 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex37.base;

import java.util.Scanner;

public class Solution37 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        PasswordGenerator passwordGenerator = new PasswordGenerator();


        int minLength = prompt("What's the minimum length? ");
        int specialChars = prompt("How many special characters? ");
        int numbers = prompt("How many numbers? ");
        int letters = minLength - (specialChars + numbers);

        while(letters < (specialChars + numbers)){
            letters++;
        }

        String password = passwordGenerator.generatePassword(specialChars, numbers, letters);
        output(password);


    }

    private static int prompt(String prompt){
        int result;
        System.out.println(prompt);
        String response = input.nextLine();
        while(!response.matches("[0-9]+")){
            System.out.println("Input invalid, please try again: ");
            response = input.nextLine();
        }
        result = Integer.parseInt(response);
        return result;
    }

    private static void output(String password){
        System.out.println("Your password is "+ password + ".");
    }
}
