/*
 *  UCF COP3330 Summer 2021 Assignment 34 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex40.base;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Solution40 {

    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        FillList populateList = new FillList();
        List<Map<String, String>> unsortedList = FillList.listPopulater();



        System.out.println("Enter a search key:");
        String key = input.nextLine();

        for(int i = 0; i < unsortedList.size(); i++){
            if(unsortedList.get(i).get("firstName").contains(key) || unsortedList.get(i).get("lastName").contains(key) || unsortedList.get(i).get("position").contains(key)){
                names.add(unsortedList.get(i).get("firstName"));
            }
        }

        Collections.sort(names);
        printNames(names, unsortedList);
    }

    public static void printNames(List<String> names, List<Map<String, String>> sortedList){
        System.out.println("Name                | Position          | Separation Date\n");
        System.out.println("--------------------|-------------------|----------------");

        for(int i = 0; i < names.size(); i++){
            for(int j = 0; j < sortedList.size(); j++){
                if((names.get(i)).equals((sortedList.get(j)).get("lastName"))){
                    System.out.printf("%-20s| %-20s| %-20s \n", (sortedList.get(i).get("firstName") + " " + sortedList.get(i).get("lastName")), sortedList.get(i).get("position"), sortedList.get(i).get("SeparationDate"));
                }
            }
        }
    }
}
