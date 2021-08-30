package part4.compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);        //내림차순
//        return (s1.compareTo(s2)) *-1 ; //오름차순
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);

    }
}
