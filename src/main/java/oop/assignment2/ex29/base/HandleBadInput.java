package oop.assignment2.ex29.base;

public class HandleBadInput
{
    public boolean checkInput(String input)
    {

        if(!input.matches("[0-9]+") || input.equals("0"))
        {
            System.out.println("Please enter numerical values greater than 0:");
            return false;
        }
        else
        {
            return true;
        }
    }
}
