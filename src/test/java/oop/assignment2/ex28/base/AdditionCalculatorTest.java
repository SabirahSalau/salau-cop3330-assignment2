package oop.assignment2.ex28.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionCalculatorTest {

    @Test
    @DisplayName("Adding 1,2,3,4,5")
    void addNumbers()
    {
        AdditionCalculator app = new AdditionCalculator();
        double numArr[] = {1.0 , 2.0, 3.0, 4.0, 5.0};
        double actual = app.addNumbers(numArr);
        double expected = 15.0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Adding 101,202,303,404,505")
    void addMoreNumbers()
    {
        AdditionCalculator app = new AdditionCalculator();
        double numArr[] = {101.0 , 202.0, 303.0, 404.0, 505.0};
        double actual = app.addNumbers(numArr);
        double expected = 1515.0;
        assertEquals(expected,actual);
    }
}