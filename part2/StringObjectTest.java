package part2;

public class StringObjectTest {
    public static void main(String[] args) {
//        final String literal = "Hello";  // 리터럴
//        final String object = new String("Hello");  // 객체
//        final String intern = literal.intern();  // 리터럴의 인턴
//
//        System.out.println(literal.equals(object)); // true
//        System.out.println(literal == object);  // false
//        System.out.println(literal.equals(intern));  // true
//        System.out.println(literal == intern);  // true

//        String immutableObj = "Java";
//        immutableObj = "JavaWorld";
//        System.out.println(immutableObj);
//
//        StringBuilder mutableObj = new StringBuilder();
//        mutableObj.append("Java");
//        mutableObj.append("World");
//        System.out.println(mutableObj);
//
//        StringBuffer syncMutableObj = new StringBuffer();
//        syncMutableObj.append("Java");
//        syncMutableObj.append("World");
//        System.out.println(syncMutableObj);

//        String a = " Good";
//        String c = immutableObj+a; // new StringBuilder(String.valueOf(a)).append(b).toString();

        // StringBuffer VS +
        String s1 = "back";
        String s2 = "end";
        String s3 = s1 + s2;
//
        String s4 = new StringBuffer().append(s1).append(s2).toString();
//
//        System.out.println(s3);
//        System.out.println(s4);
//
        String sPlus = "back";
        long start1 = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            sPlus += "end";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(sPlus);
        System.out.println(end1-start1);
//
        StringBuffer sSB = new StringBuffer("back");
        long start2 = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            sSB.append("end");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(sSB);
        System.out.println(end2-start2);
    }
}
