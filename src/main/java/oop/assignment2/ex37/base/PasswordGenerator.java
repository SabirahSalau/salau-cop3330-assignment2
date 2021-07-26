package oop.assignment2.ex37.base;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public static String generatePassword(int specialChars, int numbers, int letters){
        Random random = new Random();
        ArrayList<Character> password = new ArrayList<>();
        int i;

        String sAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String sSpecial = "!@#$%^&*";
        String sNumerics = "0123456789";

        for(i = 0; i < specialChars; i++){
            password.add(sSpecial.charAt(random.nextInt(sSpecial.length())));
        }

        for(i = 0; i < numbers; i++){
            password.add(sNumerics.charAt(random.nextInt(sNumerics.length())));
        }

        for(i = 0; i < letters; i++){
            password.add(sAlphabet.charAt(random.nextInt(sAlphabet.length())));
        }

        Collections.shuffle(password);
        String result = "";
        for(i = 0; i < password.size(); i++)
        {
            result += password.get(i).toString();
        }
       return result;
    }


}
