package part4.compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest2 {
    public static void main(String[] args) {
        String a = "5";
        String b = "2";
        String c = "4";

        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        };
        Person p = new Person(11,"11");
        System.out.println(p.getClass());
        System.out.println(comp1.getClass());

        int i = comp1.compare(a,b);
        if(i > 0){
            System.out.println("a객체가 b객체보다 큽니다.");
        }else if(i == 0){
            System.out.println("a객체와 b객체가 같습니다.");
        }else{
            System.out.println("a객체보다 b객체가 큽니다.");
        }
    }
}
