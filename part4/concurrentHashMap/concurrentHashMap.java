package part4.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();

        // 값 입력
        chm.put("a", 0);

        /*
         * ConcurrentHashMap은 값에 null을 허용하지 않는다.
         */
        try{
            chm.put("b", null); // error!
        } catch( Exception e ){
            e.printStackTrace();
        }

        /*
         * ConcurrentHashMap은 키값에 null을 허용하지 않는다.
         */
        try{
            chm.put(null, 0); // error!
        } catch( Exception e ){
            e.printStackTrace();
        }

        /*
         * putIfAbsent 메소드는 키값이 존재하면 기존의 값을 반환하고
         * 없다면 입력한 값을 저장한 뒤 반환한다.
         */
        chm.putIfAbsent("a", 1);

        chm.putIfAbsent("c", 4);

        for( String s : chm.keySet() ){
            System.out.println(chm.get(s));
        }
    }
}