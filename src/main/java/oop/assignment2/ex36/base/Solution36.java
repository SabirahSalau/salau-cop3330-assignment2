/*
 *  UCF COP3330 Summer 2021 Assignment 36 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex36.base;

import java.util.*;

public class Solution36 {

    static ArrayList<Double> numbers = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Calculations calculations = new Calculations();
        inputs();
        printNumbers();

        double average = calculations.average();
        double min = calculations.minimum();
        double max = calculations.maximum();
        double standardDev = calculations.standardDeviation(average);

        output(average, min, max, standardDev);




    }

    private static void inputs(){
        boolean loop = true;
        String stringEntry = "";
        double numberEntry;

        while(loop){
            System.out.println("Enter a number: ");
            stringEntry = input.nextLine();
            if(stringEntry.equals("done")){
                break;
            }
            else{
                if(!stringEntry.matches("[0-9]+")){
                    System.out.println("Invalid input, try again: ");
                    stringEntry = input.nextLine();
                }
            }
            numberEntry = Double.parseDouble(stringEntry);
            numbers.add(numberEntry);
        }

    }

    public static void printNumbers(){
        System.out.println("Numbers: ");
        for(Double value: numbers){
            System.out.println(value);
        }
    }

    public static void output(double avg, double min, double max, double standardDev){
        System.out.printf("The average is %.2f.", avg);
        System.out.printf("\nThe minimum is %.2f.", min);
        System.out.printf("\nThe maximum is %.2f.", max);
        System.out.printf("\nThe standard deviation is %.2f.", standardDev);

    }


}
