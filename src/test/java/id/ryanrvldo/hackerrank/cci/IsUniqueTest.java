package id.ryanrvldo.hackerrank.cci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class IsUniqueTest {

    @Test
    @DisplayName("Test if String has all unique characters should returns true")
    void testStringIsUniqueChars_ReturnTrue() {
        StringBuilder dummyStr = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            dummyStr.append((char) i);
        }

        boolean result = IsUnique.isUniqueChars(dummyStr.toString());

        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("Test if String has all not unique characters should returns false")
    void testStringIsNotUniqueChars_ReturnsFalse() {
        StringBuilder dummyStr = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            dummyStr.append((char) i);
        }

        boolean result = IsUnique.isUniqueChars(dummyStr.toString());

        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("Test validate all String has unique characters should returns true")
    void testAllStringHasUniqueChars_ReturnsTrue() {
        String[] dummyWords = {"abcde", "hello", "apple", "kite", "padle"};
        boolean[] resultBoolean = new boolean[dummyWords.length];

        for (int i = 0; i < dummyWords.length; i++) {
            resultBoolean[i] = IsUnique.isUniqueChars(dummyWords[i]);
        }

        boolean[] expectedBoolean = {true, false, false, true, true};

        assertThat(resultBoolean).isEqualTo(expectedBoolean);
    }

    @Test
    @DisplayName("Test optional solution if String has all unique characters should returns true")
    void testOptionalStringIsUniqueChars_ReturnTrue() {
        StringBuilder dummyStr = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            dummyStr.append((char) i);
        }

        boolean result = IsUnique.optionalIsUniqueChars(dummyStr.toString());

        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("Test optional if String has all not unique characters should returns false")
    void testOptionalStringIsNotUniqueChars_ReturnsFalse() {
        StringBuilder dummyStr = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            dummyStr.append((char) i);
        }

        boolean result = IsUnique.optionalIsUniqueChars(dummyStr.toString());

        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("Test optional validate all String has unique characters should returns true")
    void testOptionalAllStringHasUniqueChars_ReturnsTrue() {
        String[] dummyWords = {"abcde", "hello", "apple", "kite", "padle"};
        boolean[] resultBoolean = new boolean[dummyWords.length];

        for (int i = 0; i < dummyWords.length; i++) {
            resultBoolean[i] = IsUnique.optionalIsUniqueChars(dummyWords[i]);
        }

        boolean[] expectedBoolean = {true, false, false, true, true};

        assertThat(resultBoolean).isEqualTo(expectedBoolean);
    }

}