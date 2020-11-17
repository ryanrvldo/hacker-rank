package id.ryanrvldo.hackerrank.cci;

import id.ryanrvldo.hackerrank.cci.PalindromeString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PalindromeStringTest {

    @Test
    @DisplayName("Test Odd Palindrome String Should Returns True")
    void testOddPalindromeString_ReturnsTrue() {
        String[] dummyString = {"ini", "katak", "kodok", "kasurinirusak"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isTrue();
        }
    }

    @Test
    @DisplayName("Test odd palindrome uppercase and lowercase String should returns true")
    void testOddPalindromeUpAndLowString_ReturnsTrue() {
        String[] dummyString = {"inI", "katAK", "kodOK", "kasurinIRUSAK"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isTrue();
        }
    }

    @Test
    @DisplayName("Test Odd Not Palindrome String Length Should Returns False")
    void testOddNotPalindromeString_ReturnsFalse() {
        String[] dummyString = {"table", "issue", "mouse", "charger"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isFalse();
        }
    }

    @Test
    @DisplayName("Test Even Palindrome String Should Return True")
    void testEvenPalindromeString_ReturnsTrue() {
        String[] dummyString = {"gigi", "ggii", "giig", "igig", "iggi", "iigg", "tacocat", "atco cta"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isTrue();
        }
    }

    @Test
    @DisplayName("Test Even Palindrome String Should Return True")
    void testEvenPalindromeUpAndLowString_ReturnsTrue() {
        String[] dummyString = {"giGI", "ggII", "giIG", "igIG", "igGI", "iiGG"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isTrue();
        }
    }

    @Test
    @DisplayName("Test Even Not Palindrome String Length Should Returns False")
    void testEvenNotPalindromeString_ReturnsFalse() {
        String[] dummyString = {"chair", "tissue", "jacket", "charge"};
        for (String str : dummyString) {
            boolean result = PalindromeString.isPalindromeString(str);
            assertThat(result).isFalse();
        }
    }
}