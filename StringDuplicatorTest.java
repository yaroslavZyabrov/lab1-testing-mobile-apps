package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringDuplicatorTest {

    @Test
    public void testDuplicate_withValidString_shouldReturnDuplicatedString() {
        StringDuplicator SUT = new StringDuplicator();
        String input = "hello";

        String result = SUT.duplicate(input);

        assertEquals("hellohello", result);
    }

    @Test
    public void testDuplicate_withEmptyString_shouldReturnEmptyString() {
        StringDuplicator SUT = new StringDuplicator();
        String input = "";

        String result = SUT.duplicate(input);

        assertEquals("", result);
    }

    @Test
    public void testDuplicate_withNullString_shouldReturnNullString() {
        StringDuplicator SUT = new StringDuplicator();
        String input = null;

        String result = SUT.duplicate(input);

        assertEquals(null, result);
    }
}
