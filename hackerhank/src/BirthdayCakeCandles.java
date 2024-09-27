import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));

    }

    static int birthdayCakeCandles(List<Integer> candles) {

        Map<Integer, Integer> candlesMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int candle : candles) {
            candlesMap.put(candle, candlesMap.getOrDefault(candle, 0) + 1);
            if (candle > max) max = candle;
        }

        return candlesMap.get(max);
    }
}
