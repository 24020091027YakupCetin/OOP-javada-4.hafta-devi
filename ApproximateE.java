package approximatee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {

    public static BigDecimal calculateE(int i) {
        int precision = 25;
        BigDecimal e = BigDecimal.ONE;
        BigDecimal item = BigDecimal.ONE;

        for (int k = 1; k <= i; k++) {
            item = item.divide(new BigDecimal(k), precision, RoundingMode.HALF_UP);
            e = e.add(item);
        }

        return e;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal eValue = calculateE(i);
            System.out.println("i = " + i + " : " + eValue);
        }
    }
}