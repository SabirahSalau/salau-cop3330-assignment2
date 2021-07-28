package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validateTrue() {

        Validator validator = new Validator();
        boolean actual = validator.validate("25");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void validateFalse() {

        Validator validator = new Validator();
        boolean actual = validator.validate("twentyFive");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}