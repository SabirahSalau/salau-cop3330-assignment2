package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {

    @Test
    void checkIncrease() {
        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        boolean actual = KarvonenHeartRate.checkIncrease("21", "75");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}