package implementation;

import java.util.List;

public class BreakingRecords {

    // https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

    public static void main(String[] args) {

        breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1));

    }

    static List<Integer> breakingRecords(List<Integer> scores) {

        int maxPoints = scores.get(0);
        int minPoints = scores.get(0);
        int maxScore = 0;
        int minScore = 0;

        for (int index = 1; index < scores.size(); index++) {
            if (scores.get(index) > maxPoints) {
                maxPoints = scores.get(index);
                maxScore++;
            }
            if (scores.get(index) < minPoints) {
                minPoints = scores.get(index);
                minScore++;
            }
        }

        return List.of(maxScore, minScore);
    }
}
