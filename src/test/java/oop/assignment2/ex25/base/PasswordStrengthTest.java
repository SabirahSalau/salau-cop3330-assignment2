package oop.assignment2.ex25.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

    @Test
    @DisplayName("(Very Weak) '12345'")
    void passwordValidator()
    {
        PasswordStrength passwordStrength = new PasswordStrength();
        int actual = passwordStrength.passwordValidator("12345");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(Weak) 'abcdef'")
    void passwordValidator2()
    {
        PasswordStrength passwordStrength = new PasswordStrength();
        int actual = passwordStrength.passwordValidator("abcdef");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(Strong) 'abc123xyz'")
    void passwordValidator3()
    {
        PasswordStrength passwordStrength = new PasswordStrength();
        int actual = passwordStrength.passwordValidator("abc123xyz");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(Very Strong) '1337@xor!'")
    void passwordValidator4()
    {
        PasswordStrength passwordStrength = new PasswordStrength();
        int actual = passwordStrength.passwordValidator("1337@xor!");
        int expected = 4;
        assertEquals(expected, actual);
    }
}