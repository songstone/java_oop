package part1;

public class MemoryTest {
    public static void main(String[] args) {
        int argument = 4;
        System.out.println("First argument: " +argument);
        argument = doubleOperation(argument);
        System.out.println("Second argument: " +argument);
    }

    private static int doubleOperation(int param){
        int result = param * 2;
        return result;
    }
}

//public class MemoryTest {
//    public static void main(String[] args) {
//        int port = 9000;
//        String host = "localhost";
//    }
//}