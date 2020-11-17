package id.ryanrvldo.hackerrank.cci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class URLifyTest {

    @Test
    @DisplayName("Test string contains space replaced with %20 should return url format string")
    void testStringContainsSpaceReplaced_ReturnsUrlFormatString() {
        String[] dummyString = {"Mr John Smith      "};
        int[] dummySize = {13};

        for (int i = 0; i < dummyString.length; i++) {
            String result = URLify.convertStringToUrl(dummyString[i], dummySize[i]);

            assertThat(result).isEqualTo("Mr%20John%20Smith");
        }
    }
}