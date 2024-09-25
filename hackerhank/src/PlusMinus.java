import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {

    // https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

    public static void main(String[] args) {
        plusMinus(List.of(-92, -21, -93, -27, -45, -63, 53, 45, 0, 6, -67, 84, 96, 86, 18, 36, 53, 0, 47, 88, 91, -59, 65, 62, 3, 13, 0, -49, -47, 94, -63, 65, -23, 48, -5, 0, -10, 67, -23, 19, -11, 46, 80, -83, 0, -40, 74, -63, -20, -72, 98, -72, 66, 0, -58, -1, 67, -22, 8, -45, 32, -65, 0, -10, -65, -81, -36, -55, -99, -18, -82));
    }

    static void plusMinus(List<Integer> arr) {

        BigDecimal radius;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int number : arr) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        radius = new BigDecimal((double) positiveCount / arr.size());
        System.out.println(radius.setScale(6, RoundingMode.HALF_UP));

        radius = new BigDecimal((double) negativeCount / arr.size());
        System.out.println(radius.setScale(6, RoundingMode.HALF_UP));

        radius = new BigDecimal((double) zeroCount / arr.size());
        System.out.println(radius.setScale(6, RoundingMode.HALF_UP));

    }
}
