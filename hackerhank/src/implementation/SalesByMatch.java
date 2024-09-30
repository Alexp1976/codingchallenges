package implementation;

import java.util.*;

public class SalesByMatch {

    // https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(sockMerchant(7, List.of(1, 2, 1, 2, 1, 3, 2)));
    }

    static int sockMerchant(int n, List<Integer> ar) {

        Set<Integer> socks = new HashSet<>();
        int pairs = 0;

        for (int sock : ar) {
            if (!socks.contains(sock)) {
                socks.add(sock);
            } else {
                pairs++;
                socks.remove(sock);
            }
        }

        return pairs;
    }
}
