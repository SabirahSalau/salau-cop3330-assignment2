package oop.assignment2.ex32.base;

public class Validator
{
    public boolean validate(String input)
    {
        if(!input.matches("[0-9]+"))
        {
            System.out.println("Enter numerical values only:");
            return false;
        }

        return true;
    }
}
