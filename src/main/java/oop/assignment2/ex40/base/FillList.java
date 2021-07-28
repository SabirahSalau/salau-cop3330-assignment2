package oop.assignment2.ex40.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FillList {
    public static List<Map<String,String>> listPopulater (){

        List<Map<String, String>> unsortedList = new ArrayList<Map<String, String>>();

        Map<String, String> employee1 = new HashMap<String, String>();
        Map<String, String> employee2 = new HashMap<String, String>();
        Map<String, String> employee3 = new HashMap<String, String>();
        Map<String, String> employee4 = new HashMap<String, String>();
        Map<String, String> employee5 = new HashMap<String, String>();
        Map<String, String> employee6 = new HashMap<String, String>();


        employee1.put("firstName", "John");
        employee1.put("lastName", "Johnson");
        employee1.put("position", "Manager");
        employee1.put("SeparationDate", "2016-12-31");

        employee2.put("firstName", "Tou");
        employee2.put("lastName", "Xiong");
        employee2.put("position", "Software Engineer");
        employee2.put("SeparationDate", "2016-10-05");

        employee3.put("firstName", "Michaela");
        employee3.put("lastName", "Michaelson");
        employee3.put("position", "District Manager");
        employee3.put("SeparationDate", "2015-12-19");

        employee4.put("firstName", "Jake");
        employee4.put("lastName", "Jacobson");
        employee4.put("position", "Programmer");
        employee4.put("SeparationDate", "");

        employee5.put("firstName", "Jacquelyn");
        employee5.put("lastName", "Jackson");
        employee5.put("position", "DBA");
        employee5.put("SeparationDate", "");

        employee6.put("firstName", "Sally");
        employee6.put("lastName", "Webber");
        employee6.put("position", "Web Developer");
        employee6.put("SeparationDate", "2015-12-18");

        unsortedList.add(employee1);
        unsortedList.add(employee2);
        unsortedList.add(employee3);
        unsortedList.add(employee4);
        unsortedList.add(employee5);
        unsortedList.add(employee6);

        return unsortedList;
    }
}
