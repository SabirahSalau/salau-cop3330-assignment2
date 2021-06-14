package oop.assignment2.ex29.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandleBadInputTest {

    @Test
    @DisplayName("Test for 0")
    void checkInvalidInput()
    {
        HandleBadInput app = new HandleBadInput();
        boolean actual = app.checkInput("0");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for 4")
    void checkValidInput()
    {
        HandleBadInput app = new HandleBadInput();
        boolean actual = app.checkInput("4");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for ABC")
    void checkLetterInput()
    {
        HandleBadInput app = new HandleBadInput();
        boolean actual = app.checkInput("ABC");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}