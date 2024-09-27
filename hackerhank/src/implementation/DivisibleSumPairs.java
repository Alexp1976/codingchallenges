package implementation;

import java.util.List;

public class DivisibleSumPairs {

    // https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }

    static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int[] count = new int[k];
        int pairCount = 0;

        for (int number : ar) {
            int remainder = number % k;
            count[remainder]++;
        }

        pairCount += (count[0] * (count[0] -1)) / 2;

        for (int index = 1; index <= k / 2; index++) {
            if (index == k - index) {
                pairCount += (count[index] * (count[index] - 1)) / 2;
            } else {
                pairCount += count[index] * count[k - index];
            }
        }

        return pairCount;
    }
}
