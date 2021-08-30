package part4.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iteratorSetTest {
    public static void main(String[] args) {
        Set<String> appleDevices = new HashSet<>();
        appleDevices.add("아이패드");
        appleDevices.add("맥북");
        appleDevices.add("아이폰");
        appleDevices.add("애플워치");
        appleDevices.add("애플워치");

        System.out.println("[while문을 사용한 경우]");
        Iterator<String> iterator = appleDevices.iterator();

        while(iterator.hasNext())
        {
            System.out.println("appleDevices : " + iterator.next());
        }

        System.out.println("[for-each문을 사용한 경우]");
        for (String device : appleDevices)
        {
            System.out.println("appleDevices : " + device);
        }
    }
}
