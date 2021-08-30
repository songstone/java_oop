package part4.oome;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorHeap {
    public static void main(String[] args) {

        // java.lang.OutOfMemoryError: Java Heap Space
        List<byte[]> list = new ArrayList<>();
        int index = 1;

        while (true) {
            // 1MB = 1048576 byte
            byte[] byteArray = new byte[1048576];
            list.add(byteArray);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", index++, rt.freeMemory());
        }
    }
}
