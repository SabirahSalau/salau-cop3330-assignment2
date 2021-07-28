package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void yesOutputTest() {

        Solution33 solution33 = new Solution33();

        String expected = ("Yes.");
        String actual = solution33.output(0);
        assertEquals(expected, actual);
    }

    @Test
    void noOutputTest() {

        Solution33 solution33 = new Solution33();

        String expected = ("No.");
        String actual = solution33.output(1);
        assertEquals(expected, actual);
    }

    @Test
    void maybeOutputTest() {

        Solution33 solution33 = new Solution33();

        String expected = ("Maybe.");
        String actual = solution33.output(2);
        assertEquals(expected, actual);
    }

    @Test
    void aalTest() {

        Solution33 solution33 = new Solution33();

        String expected = ("Ask again later.");
        String actual = solution33.output(3);
        assertEquals(expected, actual);
    }

}