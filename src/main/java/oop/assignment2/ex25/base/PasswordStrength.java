package oop.assignment2.ex25.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength
{
    public int passwordValidator(String password)
    {
            //A very weak password contains only numbers and is fewer than eight characters.
            //A weak password contains only letters and is fewer than eight characters.
            //A strong password contains letters and at least one number and is at least eight characters.
            //A very strong password contains letters, numbers, and special characters and is at least eight characters.

        int passwordLength = password.length();
        int result = 0;

        Pattern letters = Pattern.compile("[a-zA-z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}/\\\\~-]");


        Matcher hasLetter = letters.matcher(password);
        boolean foundLetters = hasLetter.find();

        Matcher hasDigits = digits.matcher(password);
        boolean foundDigits = hasDigits.find();

        Matcher hasSpecial = special.matcher(password);
        boolean foundSpecial = hasSpecial.find();

        if(passwordLength < 8)
        {
            if(foundDigits && !foundLetters)
            {
                result = 1;
            }

            if(!foundDigits && foundLetters)
            {
                result = 2;
            }
        }
        else
        {
            if(foundDigits && foundLetters)
            {
                result = 3;
            }

            if(foundDigits && foundLetters && foundSpecial)
            {
                result = 4;
            }

        }
        
        return result;
    }
}
