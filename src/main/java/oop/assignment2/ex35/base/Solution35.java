/*
 *  UCF COP3330 Summer 2021 Assignment 35 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> contestants = new ArrayList<>();

    public static void main(String[] args){


        String current = "";
        boolean loop = true;

        while(loop){
            System.out.println("Enter a name: ");
            current = input.nextLine();
            if(current == ""){
                break;
            }
            contestants.add(current);
        }
        String winner = winningContestant();
        output(winner);

    }

    public static String winningContestant(){
        Random rand = new Random();
        int number = rand.nextInt(contestants.size());
        String winner = contestants.get(number);
        return winner;
    }

    private static void output(String winner){
        System.out.println("The winner is "+ winner + ".");
    }



}
