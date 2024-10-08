package warmup;

import java.util.List;

public class MinMaxSum {

    // https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

    public static void main(String[] args) {

        minMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    static void minMaxSum(List<Integer> arr) {

        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int number : arr) {
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
