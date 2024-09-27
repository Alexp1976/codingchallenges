package implementation;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static void main(String[] args) {

        gradingStudents(List.of(73, 67, 38, 33)).forEach(System.out::println);

    }

    static List<Integer> gradingStudents(List<Integer> grades) {

        return grades.stream().map(grade -> {
            int mod = grade % 5;
            if (grade >= 38) {
                if (5 - mod < 3) {
                    grade = grade + (5 - mod);
                }
            }
            return grade;
        }).collect(Collectors.toUnmodifiableList());
    }
}
