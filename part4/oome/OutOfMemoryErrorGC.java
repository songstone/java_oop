package part4.oome;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// java.lang.OutOfMemoryError: GC Overhead Limit Exceeded
// Set -Xmx100m -XX:+UseParallelGC
public class OutOfMemoryErrorGC {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
        }
    }
}
