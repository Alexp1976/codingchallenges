package com.challenges.solution;

import com.challenges.solution.execution.Execution;
import com.challenges.solution.utils.Randomize;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NumberLineJumps implements Execution {

    @Override
    @PostConstruct
    public void execute() {

        int startPoint1 = Randomize.randomizeIntegers(1, 5, 1).get(0);
        int jumpRange1 = Randomize.randomizeIntegers(1, 5, 1).get(0);
        int startPoint2 = Randomize.randomizeIntegers(1, 5,1).get(0);
        int jumpRange2 = Randomize.randomizeIntegers(1, 5, 1).get(0);

        if (isMeetPossible(startPoint1, jumpRange1, startPoint2, jumpRange2)) {
            int meetingJump = calculateMeetJumps(startPoint1 + jumpRange1, startPoint2 + jumpRange2);
            logger.info("Kangaroos met at jump number {}", meetingJump);
        } else {
            logger.warn("Kangaroos will never meet has first starts at {} and jumps {} and second starts at {} and jumps {}",
                    startPoint1, jumpRange1, startPoint2, jumpRange2);
        }
    }

    private boolean isMeetPossible(int start1, int range1, int start2, int range2) {

        if (start1 > start2) {
            return range1 < range2;
        } else if (start2 > start1){
            return range2 < range1;
        } else {
            return range1 == range2;
        }
    }

    private int calculateMeetJumps(int jump1, int jump2) {

        if (jump1 == jump2) return 1;

        Set<Integer> jumps = new HashSet<>();
        boolean meet = false;
        int count = 0;

        while (!meet) {
            jumps.add(count * jump1);
            if (jumps.contains(count * jump2) && count > 0) {
                meet = true;
            } else {
                count++;
            }
        }

        return count;
    }
}
