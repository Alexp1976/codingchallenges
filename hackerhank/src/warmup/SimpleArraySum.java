package warmup;

import java.util.List;

public class SimpleArraySum {

    // https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(simpleArraySum(List.of(1,2,3,4,10,11)));
    }

    static int simpleArraySum(List<Integer> ar) {

        int sum = 0;

        for (int number : ar) {
            sum += number;
        }

        return sum;
    }
}
