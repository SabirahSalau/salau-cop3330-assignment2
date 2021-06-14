package oop.assignment2.ex27.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidationTest {

    @Test
    @DisplayName("Test for Valid Inputs")
    void validateInput()
    {
        InputValidation validation = new InputValidation();
        String actual = validation.validateInput("Sabirah", "Salau", "32826", "AA-1234");
        String expected = "There were no errors found.";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for Invalid Inputs")
    void invalidInputs()
    {
        InputValidation validation = new InputValidation();
        String actual = validation.validateInput("S", "S", "3282", "AA-123");
        String expected = "The first name must be at least 2 characters long!\nThe last name must be at least 2 characters long!\nThe zipcode must be a 5 digit number!\nThe employee ID must be in the format of AA-1234!";
        assertEquals(expected, actual);
    }
}