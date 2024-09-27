package implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    // https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int mostSight = Integer.MAX_VALUE;
        int maxSight = 0;

        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxSight) {
                mostSight = entry.getKey();
                maxSight = entry.getValue();
            } else if (entry.getValue() == maxSight && entry.getKey() < mostSight) {
                mostSight = entry.getKey();
            }
        }

        return mostSight;
    }

}
