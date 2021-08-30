package part4.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorVSListSize {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        int inRoopSize = 100;
        int maxRoopSize = 10000000;

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Double> result = new ArrayList<Double>();

        Double[] arr = new Double[10000000];

        for (int i = 0; i < maxRoopSize; i++)
            list.add(i);

        // Iterator 사용 시 실행 시간
        System.out.println("[Iterator 사용]");
        for (int idx = 0; idx < inRoopSize; idx++) {
            start = System.nanoTime(); // 시작시간
            Iterator<Integer> itr = list.iterator();
            while (itr.hasNext()) {
                list.get(itr.next());
            }
            end = System.nanoTime(); // 끝나는 시간
            result.add(((double) (end - start) / 1000000000));

        }
        for (int i = 0; i < inRoopSize; i++)
            arr[i] = result.get(i);

        for (int i = 0; i < inRoopSize; i++)
            for (int j = 0; j < inRoopSize; j++)
                if (arr[i] < arr[j]) {
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
        for (int i = 0; i < 10; i++)
            System.out.println((i + 1) + " : " + arr[i] + "(sec)");

        // list.size() 메서드 사용
        System.out.println("\n[list.size() 메서드 사용]");

        for (int idx = 0; idx < inRoopSize; idx++) {
            start = System.nanoTime();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
            end = System.nanoTime();
            result.add(((double) (end - start) / 1000000000));
        }

        arr = new Double[10000000];
        for (int i = 0; i < inRoopSize; i++)
            arr[i] = result.get(i);

        for (int i = 0; i < inRoopSize; i++)
            for (int j = 0; j < inRoopSize; j++)
                if (arr[i] < arr[j]) {
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
        for (int i = 0; i < 10; i++)
            System.out.println((i + 1) + " : " + arr[i] + "(sec)");
    }
}
