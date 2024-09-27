package warmup;

import java.util.List;

public class CompareTheTriplets {

    // https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(compareTriplets(List.of(5,6,7), List.of(3,6,10)));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int scoreA = 0;
        int scoreB = 0;

        for (int index = 0; index < a.size(); index++) {
            if (a.get(index) >b.get(index)) {
                scoreA++;
            } else if (a.get(index) < b.get(index)) {
                scoreB++;
            }
        }

        return List.of(scoreA, scoreB);
    }
}
