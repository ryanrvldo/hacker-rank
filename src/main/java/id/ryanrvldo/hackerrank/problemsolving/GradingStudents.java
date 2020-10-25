package id.ryanrvldo.hackerrank.problemsolving;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Link : <a>https://www.hackerrank.com/challenges/grading/problem</a>
 *
 * @version : 1
 * @implSpec JDK 8 or higher
 **/
class GradingStudents {

    /**
     * @param grades The grades before rounding
     * @return The grades after rounding as appropriate
     */
    static List<Integer> solution(List<Integer> grades) {
        return grades.stream()
                .map(grade -> {
                    int remainder = grade % 5;
                    if (!isFailingGrade(grade) || remainder < 3) return grade;
                    return grade + (5 - remainder);
                })
                .collect(Collectors.toList());
    }

    static boolean isFailingGrade(Integer grade) {
        return grade >= 38;
    }

    static List<Integer> optionalSolution(List<Integer> grades) {
        return grades.stream()
                .map(grade -> !isFailingGrade(grade) || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)))
                .collect(Collectors.toList());
    }

}
