package oop.assignment2.ex28.base;

public class AdditionCalculator
{
    public double addNumbers(double[] numArr)
    {
        double result = 0;
        for(int i = 0; i < 5; i++)
        {
            result = result + numArr[i];
        }
        return result;
    }
}
