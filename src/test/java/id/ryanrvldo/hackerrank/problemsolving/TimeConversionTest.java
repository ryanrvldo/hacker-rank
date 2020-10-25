package id.ryanrvldo.hackerrank.problemsolving;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    @Test
    @DisplayName("Test 12:01:00PM time returns 12:01:00 in 24-Hour Time Format")
    public void testMidDayTimeReturns24HourTimeFormat() {
        String result = TimeConversion.solution("12:01:00PM");
        assertEquals("12:01:00", result);
    }

    @Test
    @DisplayName("Test 12:01:00AM time returns 00:01:00 in 24-Hour Time Format")
    public void testMidnightTimeReturns24HourTimeFormat() {
        String result = TimeConversion.solution("12:01:00AM");
        assertEquals("00:01:00", result);
    }

    @Test
    @DisplayName("Sample test 07:05:45PM time returns 19:05:45 in 24-Hour Time Format")
    public void testGivenSample() {
        String result = TimeConversion.solution("07:05:45PM");
        assertEquals("19:05:45", result);
    }

    @Test
    @DisplayName("Test 07:07:07AM time returns 07:07:07 in 24-Hour Time Format")
    public void testAmTimeReturns24HourTimeFormat() {
        String result = TimeConversion.solution("07:07:07AM");
        assertEquals("07:07:07", result);
    }

    @Test
    @DisplayName("Test 07:07:07PM time returns 19:07:07 in 24-Hour Time Format")
    public void testPmTimeReturns24HourTimeFormat() {
        String result = TimeConversion.solution("07:07:07PM");
        assertEquals("19:07:07", result);
    }
}