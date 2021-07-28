package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void averageTest() {
        ArrayList<Double> numbers = new ArrayList<>(){{add(10.00); add(11.00);add(12.00); add(13.00);}};
        double expected = 11.50;
        double actual = Calculations.average(numbers);
    }

    @Test
    void minimumTest() {
        ArrayList<Double> numbers = new ArrayList<>(){{add(10.00); add(11.00);add(12.00); add(13.00);}};
        double expected = 10.00;
        double actual = Calculations.minimum(numbers);
    }

    @Test
    void maximumTest() {
        ArrayList<Double> numbers = new ArrayList<>(){{add(10.00); add(11.00);add(12.00); add(13.00);}};
        double expected = 13.00;
        double actual = Calculations.maximum(numbers);
    }

    @Test
    void standardDeviationTest() {
        ArrayList<Double> numbers = new ArrayList<>(){{add(10.00); add(11.00);add(12.00); add(13.00);}};
        double expected = 1.12;
        double actual = Calculations.standardDeviation(11.50, numbers);
    }
}