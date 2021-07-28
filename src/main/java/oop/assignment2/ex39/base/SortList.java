package oop.assignment2.ex39.base;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortList {

    public static List<Map<String, String>> listSorter (List<Map<String,String>> unsortedList){

        Collections.sort(unsortedList, Comparator.comparing(p -> p.get("lastName")));

        return unsortedList;
    }
}
