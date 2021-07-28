/*
 *  UCF COP3330 Summer 2021 Assignment 39 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex39.base;

import java.util.*;

public class Solution39 {

    public static void main(String[] args)
    {
        PopulateList populateList = new PopulateList();
        SortList sortList = new SortList();
        List<Map<String, String>> unsortedList = populateList.listPopulater();
        List<Map<String, String>> sortedList = sortList.listSorter(unsortedList);

        printList(sortedList);
    }

    public static void printList(List<Map<String, String>> sortedList){

        System.out.println("Name                | Position          | Separation Date\n");
        System.out.println("--------------------|-------------------|----------------");

        for(int i = 0; i < sortedList.size(); i++){
            System.out.printf("%-20s| %-20s| %-20s \n", (sortedList.get(i).get("firstName") + " " + sortedList.get(i).get("lastName")), sortedList.get(i).get("position"), sortedList.get(i).get("SeparationDate"));
        }

    }
}









