package id.ryanrvldo.hackerrank.interviewkit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CountingValleysTest {

    @Test
    @DisplayName("Test number steps is not equal to path should thrown IllegalArgumentException")
    void testNumberStepsIsNotEqualToPath_ThrownException() {
        int dummySteps = 8;
        String dummyPath = "DDUUUUDDD";

        assertThrows(IllegalArgumentException.class, () -> CountingValleys.solution(dummySteps, dummyPath));
    }

    @Test
    @DisplayName("Test path contains characters other than U and D thrown IllegalArgumentException")
    void testPathContainsCharOtherThanUAndD_ThrownException() {
        int dummySteps = 10;
        String dummyPath = "DDUUUUDDUZ";

        assertThrows(IllegalArgumentException.class, () -> CountingValleys.solution(dummySteps, dummyPath));
    }

    @Test
    @DisplayName("Test example in HackerRank should returns one valleys traversed")
    void testExampleInHackerRank_ReturnsOneValleysTraversed() {
        int dummySteps = 8;
        String dummyPath = "DDUUUUDD";

        int result = CountingValleys.solution(dummySteps, dummyPath);

        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Test sample test case in HackerRank should returns one valleys traversed")
    void testSampleTestCase_ReturnsOneValleysTraversed() {
        int dummySteps = 8;
        String dummyPath = "UDDDUDUU";

        int result = CountingValleys.solution(dummySteps, dummyPath);

        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Test custom case should returns three valleys traversed")
    void testCustomCase_ReturnsThreeValleysTraversed() {
        int dummySteps = 4 + 6 + 6 + 4 + 4;
        String dummyPath = "UUDDDDDUUUDDDUUUUUDDDDUU";

        int result = CountingValleys.solution(dummySteps, dummyPath);

        assertThat(result).isEqualTo(3);
    }


}