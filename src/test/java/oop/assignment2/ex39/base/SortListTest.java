package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @Test
    void listSorter() {

        List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();

        Map<String, String> employee1 = new HashMap<String, String>();
        Map<String, String> employee2 = new HashMap<String, String>();

        employee1.put("firstName", "Mouse");
        employee1.put("lastName", "Mickey");

        employee2.put("firstName", "Cat");
        employee2.put("lastName", "Cart");

        employeeList.add(employee1);
        employeeList.add(employee2);

        List<Map<String, String>> sortedList = SortList.listSorter(employeeList);
        String expected = "Cart";
        String actual = sortedList.get(0).get("lastName");
    }
}