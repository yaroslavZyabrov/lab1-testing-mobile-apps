package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NegativeNumberValidatorTest {

    @Test
    public void testIsNegative_withNegativeNumber_shouldReturnTrue() {
        NegativeNumberValidator SUT = new NegativeNumberValidator();

        boolean result = SUT.isNegative(-5);

        assertTrue(result);
    }

    @Test
    public void testIsNegative_withZero_shouldReturnFalse() {
        NegativeNumberValidator SUT = new NegativeNumberValidator();

        boolean result = SUT.isNegative(0);

        assertFalse(result);
    }

    @Test
    public void testIsNegative_withPositiveNumber_shouldReturnFalse() {
        NegativeNumberValidator SUT = new NegativeNumberValidator();

        boolean result = SUT.isNegative(5);

        assertFalse(result);
    }
}
