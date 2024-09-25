import java.util.List;

public class AVeryBigSum {

    // https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(aVeryBigSum(List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));
    }

    static long aVeryBigSum(List<Long> ar) {

        long sum = 0;

        for (long number : ar) {
            sum += number;
        }

        return sum;
    }
}
