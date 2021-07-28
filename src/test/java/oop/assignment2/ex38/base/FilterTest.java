package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void filterEvenNumbers() {
        String[] numberList = {"1", "2", "3", "4"};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        ArrayList<Integer> actual = Filter.filterEvenNumbers(numberList);

        assertEquals(expected, actual);
    }
}