package oop.assignment2.ex24.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    @DisplayName("Displays isAnagram for anagrams")
    void displayTrueAnswer1()
    {
        Solution24 app = new Solution24();

        String actual = app.displayAnswer(true, "tone", "note");
        String expected = ("\"tone\" and \"note\" are anagrams.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Displays isAnagram for another anagram")
    void displayTrueAnswer2()
    {
        Solution24 app = new Solution24();

        String actual = app.displayAnswer(true, "trap", "part");
        String expected = ("\"trap\" and \"part\" are anagrams.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Displays isNotAnagram for another anagram")
    void displayFalseAnswer1()
    {
        Solution24 app = new Solution24();

        String actual = app.displayAnswer(false, "top", "tip");
        String expected = ("\"top\" and \"tip\" are not anagrams.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Displays isNotAnagram for another anagram")
    void displayFalseAnswer2()
    {
        Solution24 app = new Solution24();

        String actual = app.displayAnswer(false, "break", "rake");
        String expected = ("\"break\" and \"rake\" are not anagrams.");
        assertEquals(expected, actual);
    }
}