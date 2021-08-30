package part4.objects;

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
        String sPlus = "back";
        long start1 = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            sPlus += "end";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(sPlus);
        System.out.println(end1-start1);

        StringBuffer sSB = new StringBuffer("back");
        long start2 = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            sSB.append("end");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(sSB);
        System.out.println(end2-start2);


        System.out.println(sSB.capacity());
        sSB.delete(0,7);
        System.out.println(sSB);
        System.out.println(sSB.capacity());
        sSB.trimToSize();
        System.out.println(sSB.capacity());
        System.out.println(sSB);

//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder stringBuilder = new StringBuilder("안녕하세요");
//        System.out.printf("length: %d\ncapacity: %d\n",stringBuilder.length(), stringBuilder.capacity());
//        stringBuilder.append("back");
//        System.out.printf("length: %d\ncapacity: %d\n",stringBuilder.length(), stringBuilder.capacity());
//        stringBuilder.trimToSize();
//        System.out.printf("length: %d\ncapacity: %d\n",stringBuilder.length(), stringBuilder.capacity());
    }
}

