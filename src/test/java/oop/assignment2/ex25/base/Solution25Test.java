package oop.assignment2.ex25.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    @DisplayName("Output (Very Weak) '12345'")
    void evaluateStrength()
    {
        Solution25 app = new Solution25();
        String actual = app.evaluateStrength(1, "12345");
        String expected = ("The password \'12345\' is a very weak password.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Output (Weak) 'abcdef'")
    void evaluateStrength2()
    {
        Solution25 app = new Solution25();
        String actual = app.evaluateStrength(2, "abcdef");
        String expected = ("The password \'abcdef\' is a weak password.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Output (Strong) 'abc123xyz'")
    void evaluateStrength3()
    {
        Solution25 app = new Solution25();
        String actual = app.evaluateStrength(3, "abc123xyz");
        String expected = ("The password \'abc123xyz\' is a strong password.");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Output (Very Strong) '1337@xor!'")
    void evaluateStrength4()
    {
        Solution25 app = new Solution25();
        String actual = app.evaluateStrength(4, "1337@xor!");
        String expected = ("The password \'1337@xor!\' is a very strong password.");
        assertEquals(expected, actual);
    }
}