package oop.assignment2.ex32.base;

import java.util.Random;

public class GenerateNumber
{
    public int randomNum(String difficulty)
    {
        int intDifficulty = Integer.parseInt(difficulty);
        int number = 0;
        Random random = new Random();

        if((intDifficulty > 3)|| intDifficulty < 1)
        {
            System.out.println("Pick a number from 1-3!");
            System.exit(0);
        }
        if(intDifficulty == 1)
        {
            number = random.nextInt(10);
        }
        if(intDifficulty == 2)
        {
            number = random.nextInt(100);
        }
        if(intDifficulty == 3)
        {
            number = random.nextInt(1000);
        }

        return number;
    }
}
