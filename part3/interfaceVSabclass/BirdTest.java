package part3.interfaceVSabclass;

import java.util.*;

public class BirdTest {
    public static void main(String[] args) {
//        Chicken chicken = new Chicken();
//        Owl owl = new Owl();
//
//        /* 상속받은 의 속성 */
//        chicken.setName("닭");
//        chicken.setTweetWord("꼬끼오오오");
//
//        /* 상속받은 부엉이의 속성 */
//        owl.setName("부엉이");
//        owl.setTweetWord("부엉부엉");
//
//        /* 닭 구현체의 메서드 호출 */
//        chicken.tweet();
//
//        /* 부엉이 구현체의 메서드 호출 */
//        owl.tweet();
//        owl.flyable();
//
        ArrayList<String> a = new ArrayList<>();
        a.add("dd");
        a.add("aa");
        System.out.println("AS-IS:"+ a);
        Collections.sort(a);
        System.out.println("TO-BE:"+ a);
    }
}
