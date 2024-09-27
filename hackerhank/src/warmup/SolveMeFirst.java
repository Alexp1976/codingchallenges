package warmup;

import java.util.Random;

public class SolveMeFirst {

    // https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

    public static void main(String[] args) {

        Random random = new Random();

        int a = Math.abs(random.nextInt(100));
        int b = Math.abs(random.nextInt(100));

        System.out.println(a);
        System.out.println(b);
        System.out.println(solveMeFirst(a, b));
    }

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

}