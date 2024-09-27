package warmup;

import java.util.List;

public class DiagonalDifference {

    // https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(diagonalDifference(List.of(List.of(11,2,4), List.of(4,5,6), List.of(10,8,-12))));
    }

    static int diagonalDifference(List<List<Integer>> arr) {

        int diagonalASum = 0;
        int diagonalBSum = 0;

        int size = arr.size();

        for (int index = 0; index < size; index++) {
            diagonalASum += arr.get(index).get(index);
            diagonalBSum += arr.get(index).get(size - 1 - index);
        }

        return Math.abs(diagonalASum - diagonalBSum);
    }
}
