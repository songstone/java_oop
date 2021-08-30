package part4;

import java.util.Arrays;
import java.util.stream.Stream;

public class flatMapTest {
    public static void main(String[] args) {
        String[] array = {"Won e", "Kang e", "Park e"};

        // map
        Stream<String> arrayStream = Stream.of(array);
        arrayStream.map(e -> e.toUpperCase())
                .forEach(e -> System.out.println(e));

        // flatmap
        Stream<String> arrayStream2 = Stream.of(array);
        arrayStream2
                .map(e -> e.split("\\s+"))
                .flatMap(Arrays::stream) // 여기서 flatmap 대신에 map을 쓰면 String 대신 Stream 객체가 나옴
                .distinct()
                .forEach(System.out::println);
    }
}
