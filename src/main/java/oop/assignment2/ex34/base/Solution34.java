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
        ArrayList<String> updatedEmployees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

       printEmployees(employees);

        System.out.println("\nEnter an employee name to remove:");
        String nameToRemove = input.nextLine();

        updatedEmployees = nameToRemove(employees, nameToRemove);

        printEmployees(updatedEmployees);
    }

    public static ArrayList<String> nameToRemove(ArrayList<String> employees, String nameRemoval){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).equals(nameRemoval)){
                employees.remove(i);
            }
        }

        return employees;
    }

    public static void printEmployees(ArrayList<String> employees){
        System.out.println("There are " + employees.size() + " employees:");
        for(String employee: employees){
            System.out.println(employee);
        }
    }
}
