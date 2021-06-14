/*
 *  UCF COP3330 Summer 2021 Assignment 24 Solution
 *  Copyright 2021 Sabirah Salau
 */


package oop.assignment2.ex24.base;


import java.util.Scanner;

public class Solution24
{
    private static final Scanner input = new Scanner(System.in);

    public static String displayAnswer(boolean result, String word1, String word2)
    {
        String results;
        if(result)
        {
            results = ('"' + word1 + '"' + " and " + '"' + word2 + '"' + " are anagrams.");
        }
        else
        {
            results = ('"' + word1 + '"' + " and " + '"' + word2 + '"' + " are not anagrams.");
        }

        return results;
    }

    public static void main(String[] args)
    {
        Solution24 solution24 = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:\n");
        String word1 = solution24.readWord("Enter the first string:");
        String word2 = solution24.readWord("Enter the second string:");

        AnagramChecker anagramChecker = new AnagramChecker();

        boolean result = anagramChecker.isAnagram(word1, word2);

        String results = displayAnswer(result, word1, word2);
        System.out.println(results);


    }



    private String readWord(String prompt)
    {
        System.out.println(prompt);
        String result = input.nextLine().toLowerCase();
        return result;
    }
}
