package oop.assignment2.ex24.base;

import oop.assignment2.ex24.base.AnagramChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    @DisplayName("isAnagram_returns_true_for_anagrams")
    void isAnagram()
    {
        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("tone", "note");
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("isAnagram_returns_true_for_other_anagrams")
    void isAlsoAnagram()
    {
        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("part", "trap");
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("isAnagram_returns_false_for_anagrams")
    void isNotAnagram()
    {
        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("top", "tip");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("isAnagram_returns_false_for_other_anagrams")
    void isAlsoNotAnagram()
    {
        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("break", "rake");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}