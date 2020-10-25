package id.ryanrvldo.hackerrank.problemsolving;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.truth.Truth.assertThat;

class GradingStudentsTest {

    @Test
    @DisplayName("Test filter grades isn't a failing grade")
    void testGradesIsNotFailingGrade() {
        List<Integer> dummyGrades = new ArrayList<>();

        for (int i = 20; i <= 100; i++) {
            dummyGrades.add(i);
        }
        List<Integer> filteredGrades = dummyGrades.stream()
                .filter(GradingStudents::isFailingGrade)
                .collect(Collectors.toList());

        List<Integer> expectedGrades = new ArrayList<>();
        for (int i = 38; i <= 100; i++) {
            expectedGrades.add(i);
        }

        List<Integer> unexpectedGrades = new ArrayList<>();
        for (int i = 20; i < 40; i++) {
            unexpectedGrades.add(i);
        }

        assertThat(filteredGrades).containsExactlyElementsIn(expectedGrades);
        assertThat(filteredGrades).isNotEqualTo(unexpectedGrades);
    }

    @Test
    @DisplayName("Test grades isn't a failing grade && the difference between the grade and the next multiple of 5 is less than 3 returns rounded grades")
    void testGradesIsNotFailingGradeAndDifferenceLessThanThree_ReturnsRoundedGrades() {
        List<Integer> dummyGrades = Arrays.asList(54, 43, 78, 89);
        List<Integer> roundedGrades = GradingStudents.solution(dummyGrades);

        assertThat(roundedGrades).containsExactly(55, 45, 80, 90);
    }

    @Test
    @DisplayName("Test grades isn't a failing grade && the difference between the grade and the next multiple of 5 is greater than or equal to 3 returns not rounded grades")
    void testGradesIsNotFailingGradeAndDifferenceNotLessThanThree_ReturnsNotRoundedGrades() {
        List<Integer> dummyGrades = Arrays.asList(47, 56, 65, 72, 81, 90);
        List<Integer> notRoundedGrades = GradingStudents.solution(dummyGrades);

        assertThat(notRoundedGrades).containsExactlyElementsIn(dummyGrades);
    }

    @Test
    @DisplayName("Test grades is a failing grade returns not rounded grades")
    void testGradesIsFailingGrade_ReturnsNotRoundedGrades() {
        List<Integer> dummyGrades = Arrays.asList(14, 23, 37, 9);
        List<Integer> resultGrades = GradingStudents.solution(dummyGrades);

        assertThat(resultGrades).containsExactlyElementsIn(dummyGrades);
    }

    @Test
    @DisplayName("Test sample problem in HackerRank")
    void testSampleProblem() {
        List<Integer> dummyGrades = Arrays.asList(73, 67, 38, 33);
        List<Integer> resultGrades = GradingStudents.solution(dummyGrades);

        assertThat(resultGrades).containsExactly(75, 67, 40, 33);
    }

}