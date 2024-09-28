package implementation;

import java.util.List;

public class BillDivision {

    // https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

    public static void main(String[] args) {

        bonAppetit(List.of(3, 10, 2, 9), 1, 7);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int billSum = 0;
        int billSplit;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                billSum += bill.get(i);
            }
        }

        billSplit = billSum / 2;

        if (billSplit == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((b - billSplit));
        }
    }
}
