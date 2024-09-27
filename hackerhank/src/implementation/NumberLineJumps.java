package implementation;

public class NumberLineJumps {

    // https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(kangaroo(43, 2, 70,2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x1 < x2 && v1 < v2) return "NO";
        if (x2 < x1 && v2 < v1) return "NO";
        if (x1 != x2 && v1 == v2) return "NO";

        return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";

    }
}
