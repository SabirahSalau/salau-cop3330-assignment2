/*
 *  UCF COP3330 Summer 2021 Assignment 38 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        Filter filter = new Filter();
        System.out.println("Enter a list of numbers separated by a space:");
        String numbers = input.nextLine();

        String numberList[] = numbers.split(" ");

        ArrayList<Integer> evenList = new ArrayList<>();
        evenList = filter.filterEvenNumbers(numberList);

        System.out.println("The even numbers are: ");
        for(Integer i: evenList){
            System.out.println(i);
        }
    }
}
