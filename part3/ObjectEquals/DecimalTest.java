package part3.ObjectEquals;

import java.math.BigDecimal;

public class DecimalTest {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.2;

        for(int i = 0; i<3; i++){
            d1 += d2;
            System.out.println(d1);
        }

        BigDecimal bd1 = BigDecimal.valueOf(1.0);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);

        for(int i = 0; i<3; i++){
            bd1 = bd1.add(bd2);
            System.out.println(bd1);
        }
    }
}
