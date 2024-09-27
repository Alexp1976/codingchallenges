package implementation;

import org.w3c.dom.ranges.Range;

import java.time.temporal.ValueRange;
import java.util.List;

public class AppleAndOrange {

    // https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

    public static void main(String[] args) {

        int houseLeft = 7;
        int hourRight = 10;
        int appleTree = 4;
        int orangeTree = 12;
        List<Integer> apples = List.of(2, 3, -4);
        List<Integer> oranges = List.of(3, -2, -4);

        countApplesAndOranges(houseLeft, hourRight, appleTree, orangeTree, apples, oranges);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesCount = 0;
        int orangesCount = 0;

        for (int apple : apples) {
            int location = apple + a;
            if (location >= s && location <= t) {
                applesCount++;
            }
        }

        for (int orange : oranges) {
            int location = orange + b;
            if (location >= s && location <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);
    }

}
