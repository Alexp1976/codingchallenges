package implementation;

import java.util.List;

public class SubarrayDivision {

    // https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(birthday(List.of(
                3, 5, 4, 1, 2, 5, 3, 4, 3, 2, 1, 1, 2, 4, 2, 3, 4, 5, 3, 1, 2, 5, 4, 5, 4, 1, 1, 5, 3, 1, 4, 5, 2, 3, 2, 5, 2, 5, 2, 2, 1, 5, 3, 2, 5, 1, 2, 4, 3, 1, 5, 1, 3, 3, 5), 18, 6));

    }

    static int birthday(List<Integer> s, int d, int m) {

        int shareCount = 0;

        if (s.size() == 1 && s.get(0) == d) return 1;

        for (int index = 0; index < s.size(); index++) {
            int endArray = Math.min(index + m, s.size());
            List<Integer> range = s.subList(index, endArray);
            System.out.println(range.toString());
            int sum = range.stream().reduce(0, Integer::sum);
            if (sum == d) shareCount++;
        }

        return shareCount;
    }
}
