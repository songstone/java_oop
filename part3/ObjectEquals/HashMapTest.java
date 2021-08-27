package part3.ObjectEquals;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, BigDecimal> appleStore = new HashMap<>();
        DecimalFormat df = new DecimalFormat("#,###");

        appleStore.put("imac", BigDecimal.valueOf(3000000));
        appleStore.put("iphone8", BigDecimal.valueOf(900000));
        appleStore.put("appleWatch", BigDecimal.valueOf(450000));
        appleStore.put("iphone9", BigDecimal.valueOf(1000000));

        //get value
        BigDecimal iphone8 = appleStore.get("iphone8");
        System.out.println("The price of iphone8 is: " + iphone8);

        //remove value
        appleStore.remove("iphone8");
//        appleStore.clear();

        // 모든 key를 print 하는 방법
        Set<String> keys = appleStore.keySet();

        //print all the keys
        for (String key : keys) {
            System.out.println(key);
        }

        // or
        keys.forEach(key -> System.out.println(key));

        // key, value 둘다
        Set<Map.Entry<String, BigDecimal>> entries = appleStore.entrySet();

        for (Map.Entry<String, BigDecimal> entry : entries) {
            System.out.printf("Key: %s | Value: %s원\n", entry.getKey(), df.format(entry.getValue()));
        }

        // or (lambda expression)
        appleStore.forEach((key, value) -> {
            System.out.printf("Key: %s | Value: %s원\n", key, df.format(value));
        });

    }
}
