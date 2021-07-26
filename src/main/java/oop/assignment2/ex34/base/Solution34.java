/*
 *  UCF COP3330 Summer 2021 Assignment 34 Solution
 *  Copyright 2021 Sabirah Salau
 */

package oop.assignment2.ex34.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

       printEmployees(employees);

        System.out.println("\nEnter an employee name to remove:");
        String nameToRemove = input.nextLine();

        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).equals(nameToRemove)){
                employees.remove(i);
            }
        }

        printEmployees(employees);
    }

    private static void printEmployees(ArrayList<String> employees){
        System.out.println("There are " + employees.size() + " employees:");
        for(String employee: employees){
            System.out.println(employee);
        }
    }
}
