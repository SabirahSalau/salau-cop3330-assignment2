package oop.assignment2.ex38.base;

import java.util.ArrayList;

public class Filter {

    public static ArrayList<Integer> filterEvenNumbers(String numberList[]){
        int i, number;
        ArrayList<Integer> evenList = new ArrayList<>();

        for(i = 0; i < numberList.length; i++){
            number = Integer.parseInt(numberList[i]);
            if(number % 2 == 0){
                evenList.add(number);
            }
        }

        return evenList;
    }
}
