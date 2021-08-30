package part4.objects;

import part2.Lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToStringTest {
    public static void main(String[] args) {
        // 원본 toString()
        Object object = new Object();
        System.out.println(object.toString());
        System.out.println(object);


        String[] stringArray = {"나는야", "Array임"};
        System.out.println(stringArray);
        System.out.println(stringArray.toString());
        System.out.println(Arrays.toString(stringArray));

        ArrayList<String> als = new ArrayList<>();
        als.add("나는야");
        als.add("ArrayList임");
        System.out.println(als);
        System.out.println(als.toString());
        System.out.println(als.toArray().toString());

    }
}
