package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeCalTest {

    @Test
    void timeCalculator() {
        Assertions.assertEquals(1.0, TimeCal.TimeCalculator(100.0, 100.0));
    }
}