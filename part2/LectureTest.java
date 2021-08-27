package part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureTest {
    public static void main(String[] args) {
//        int[] a = {1,2};
//        int[] c = {1,2};
//        ArrayList<Integer> b =
//                new ArrayList<>(Arrays.asList(1,2));
//        System.out.println(a.equals(c));
//        System.out.println(a.length+"VS"+ b.size());

//        System.out.println(b.equals(a));
        Lecture[] lectures = new Lecture[3];

        lectures[0] = new Lecture("원혜린", "KDT Java");
        lectures[1] = new Lecture("전형주", "KDT Python");
        lectures[2] = new Lecture("강지은", "KDT HTML");

//        for(Lecture lecture: lectures){
//            System.out.println(lecture);
//            lecture.showLectureInfo();
//        }
//
        Lecture[] copyLectures = new Lecture[3];
        System.arraycopy(lectures, 0, copyLectures, 0, 3);
//        System.out.println(Arrays.toString(lectures));
//        System.out.println(Arrays.toString(copyLectures));
//        System.out.println(Arrays.equals(copyLectures, lectures));


        Lecture[] deepCopyLecture = new Lecture[3];
        // Deep Copy~~
        // object array는 단순 clone으로는 깊은 복사 안됨
//         방법1
//        for(int i=0; i<lectures.length; i++){
//            deepCopyLecture[i] = new Lecture(lectures[i].getLecturer(), lectures[i].getName());
//            deepCopyLecture[i] = new Lecture();
//            deepCopyLecture[i].setName(lectures[i].getName());
//            deepCopyLecture[i].setLecturer(lectures[i].getLecturer());
//        }
//        System.out.println(Arrays.toString(lectures));
//        System.out.println(Arrays.toString(deepCopyLecture));
//        System.out.println(deepCopyLecture.equals(lectures));
//         방법2
        for(int i=0; i<lectures.length; i++){
            deepCopyLecture[i] = lectures[i].clone();
        }
        lectures[1] = new Lecture("원혜린2", "KDT Java2");
        for(int i=0; i<lectures.length; i++){
            lectures[i].showLectureInfo();
            deepCopyLecture[i].showLectureInfo();
        }
        System.out.println(Arrays.toString(lectures));
        System.out.println(Arrays.toString(deepCopyLecture));
        System.out.println(deepCopyLecture.equals(lectures));
//
//        copyLectures[0].setLecturer("홍길동");
//        copyLectures[0].setName("KDT NodeJS");
//        System.out.println(Arrays.equals(copyLectures, lectures));

//        for(Lecture lecture: deepCopyLecture){
//            System.out.println(lecture);
//            lecture.showLectureInfo();
//        }

        // 2차원 배열의 deep copy
        // 방법1)
//        int[][] a = {{1,2,3},{3,6,9}};
//        int[][] b = new int[a.length][a[0].length];
//
//        for(int i = 0; i < a.length; i++){
//            for(int j = 0 ; j < a[0].length; j++){
//                b[i][j] = a[i][j];
//            }
//        }
//
//        // 방법2)
//        int[][] c = new int[a.length][a[0].length];
//        for(int i = 0; i < a.length; i++){
//            System.arraycopy(a[i], 0, c[i], 0, a[0].length);
//        }
//
//        a[0][0] = 3;
//        System.out.println(Arrays.deepToString(a));
//        System.out.println(Arrays.deepToString(b));
//        System.out.println(Arrays.deepToString(c));
//
//
//        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//        numbers.remove(0);
//        System.out.println(numbers);
//
//        ArrayList<String> lastNames =
//                new ArrayList<String>(Arrays.asList("김", "박", "이", "원"));
//        System.out.println(lastNames);
//
//        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int index = 3;
//        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
//        System.out.println(Arrays.toString(array));
        ArrayList<String> a = new ArrayList<>();
        a.add("aa");
        a.add("bb");
        a.add("cc");
        ArrayList<String> c = (ArrayList<String>) a.clone();
        System.out.println(a);
        System.out.println(c);
        List<String> b = a;
        ArrayList<String> d = (ArrayList<String>)b;


    }
}
