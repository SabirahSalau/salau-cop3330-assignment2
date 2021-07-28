package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void nameToRemove() {
        Solution34 solution34 = new Solution34();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Fido");
        employees.add("Difo");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("John");
        expected.add("Fido");
        ArrayList<String> actual = new ArrayList<>();
        actual = solution34.nameToRemove(employees, "Difo");

        assertEquals(expected, actual);
    }
}