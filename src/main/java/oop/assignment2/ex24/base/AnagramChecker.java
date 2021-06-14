package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramChecker
{
    public boolean isAnagram(String word1, String word2)
    {
        boolean result;
        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 != length2)
        {
            result = false;
        }

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String str1 = new String(char1);
        String str2 = new String(char2);

        if(str1.matches(str2))
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }
}
