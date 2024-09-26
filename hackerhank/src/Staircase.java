import java.util.Arrays;

public class Staircase {

    // https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

    public static void main(String[] args) {

        staircase(4);
    }

    static void staircase(int n) {

        char[] line = new char[n];

        for (int index = n - 1; index >= 0; index--) {
            Arrays.fill(line, 0, n, ' ');
            Arrays.fill(line, index, n, '#');
            System.out.println(new String(line));
        }

    }
}
