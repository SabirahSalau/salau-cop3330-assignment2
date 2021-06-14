/*
 *  UCF COP3330 Summer 2021 Assignment 30 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex30.base;

import java.util.Scanner;

public class Solution30
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        MultiplicationTable table = new MultiplicationTable();

        int tableSize = 12;
        table.generateTable(12);

    }
}
