package oop.assignment2.ex27.base;

public class InputValidation
{
    public String validateInput(String firstName, String lastName, String zip, String ID)
    {
        boolean firstNameResult = validNames(firstName);
        boolean lastNameResult = validNames(lastName);
        boolean ZIPResult = validZIP(zip);
        boolean IDResult = validID(ID);
        String validations = "";

        if(!firstNameResult)
        {
            validations = validations.concat("The first name must be at least 2 characters long!\n");
        }
        if(!lastNameResult)
        {
            validations = validations.concat("The last name must be at least 2 characters long!\n");
        }
        if(!ZIPResult)
        {
            validations = validations.concat("The zipcode must be a 5 digit number!\n");
        }
        if(!IDResult)
        {
            validations = validations.concat("The employee ID must be in the format of AA-1234!");
        }
        else
        {
            validations = "There were no errors found.";
        }

        return validations;
    }

    private boolean validNames(String name)
    {
        return name.length() >= 2;
    }

    private boolean validZIP(String zip)
    {
        if(zip.length() != 5)
        {
            return false;
        }
        return zip.matches("[0-9]+");
    }

    private boolean validID(String ID)
    {
        char[] charID = ID.toCharArray();
        if(ID.length() != 7)
        {
            return false;
        }
        if(charID[2] != '-')
        {
            return false;
        }
        if(!Character.isLetter(charID[0]) || !Character.isLetter(charID[1]))
        {
            return false;
        }
        for(int i = 3; i <= 6; i++)
        {
            if(!Character.isDigit(charID[i]))
            {
                return false;
            }
        }
       return true;
    }

}
