package com.challenges.solution.gradingstudents;

import com.challenges.solution.execution.Execution;
import com.challenges.solution.utils.Randomize;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradingStudents implements Execution {

    @Override
    @PostConstruct
    public void execute() {

        List<Integer> grades = Randomize.randomizeIntegers(0, 101, 20);

        for (Integer grade : grades) {
            int nextGrade = closestGrade(grade, 5);
            if (nextGrade - grade < 3) {
                logger.info("Grade {} has been rounded to {}", grade, nextGrade);
            } else {
                logger.info("Grade {} was not changed", grade);
            }

        }
    }

    private int closestGrade(int grade, int divisor) {

        int quotient = grade / divisor;

        return (grade * divisor) > 0 ? (divisor * (quotient + 1)) : (divisor * (quotient - 1));

    }
}
