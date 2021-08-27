package part3.ObjectEquals;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {
    public static void main(String[] args) {
//        Person p1 = new Person(1,  "01011111111");
//        Person p2 = new Person(2, "01011111111");
//        System.out.println(p1 == p2);
//        System.out.println(p1.equals(p2));

//
//        Person p3 = new Person(2, "01011111111");
        // 방법1
//        System.out.println(p2.getId() == p3.getId() && p2.getPhoneNumber().equals(p3.getPhoneNumber()));
//        System.out.println(p1.getId() == p2.getId() && p1.getPhoneNumber().equals(p2.getPhoneNumber()));

        // 방법2
//        System.out.println(p2.equals(p3));


        // set은 중복 제거 자료구조!
        Set<Person> hset = new HashSet<>();
        Person p4 = new Person(4,  "01011111111");
        Person p5 = new Person(4,  "01011111111");
        System.out.println("p4 : "+p4.hashCode());
        System.out.println("p5 : "+p5.hashCode());
        System.out.println(p4.equals(p5));
        hset.add(p4);
        hset.add(p5);
        System.out.println(hset.size());


        // hashCode 계산
        // 변수 선언 - 값이 커지면 overflow로 값이 다르게 나올 수 있기 때문에 작은 값으로 표현한다.
        String a = "hello";
        String b = "hello";
        // print
        System.out.println("a hashCode = " + a.hashCode());
        System.out.println("b hashCode = " + b.hashCode());
        // a를 char 배열로.
        char[] c = a.toCharArray();
        // 해쉬 코드 계산
        int hashCode = calcHashCode(c, c.length - 1, 0);
        // print
        System.out.println("calc hashCode = " + hashCode);

    }
    // 해쉬 값 계산하기.
    public static int calcHashCode(char[] array, int p, int n) {
        if (p < 0) {
            return 0;
        }
        // s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]
        return array[p] * (int) Math.pow(31, n) + calcHashCode(array, p - 1, n + 1);
    }
}
