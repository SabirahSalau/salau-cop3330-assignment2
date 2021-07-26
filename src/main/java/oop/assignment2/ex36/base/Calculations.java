package oop.assignment2.ex36.base;

import java.util.Collections;

import static oop.assignment2.ex36.base.Solution36.numbers;

public class Calculations {


    public static double average(){
        double average;
        double sum = 0.0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        average = sum / numbers.size();
        return average;
    }

    public static double minimum(){
        Collections.sort(numbers);
        double min = numbers.get(0);
        return min;
    }

    public static double maximum(){
        Collections.sort(numbers);
        double max = numbers.get(numbers.size() - 1);
        return max;
    }

    public static double standardDeviation(double avg){
        double temp = 0.0;

        for(int i = 0; i < numbers.size(); i++){
            temp = temp + Math.pow(numbers.get(i) - avg, 2);
        }

        temp = temp / numbers.size();

        return Math.sqrt(temp);
    }
}
