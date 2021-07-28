package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FillListTest {

    @Test
    void listPopulater() {

        List<Map<String, String>> list = FillList.listPopulater();

        String expected = "Johnson";
        String actual = list.get(0).get("lastName");

        assertEquals(expected, actual);
    }
}