package part2;

public class StaticTest{
    int var1 = 0;
    static int var2 = 0;

    public static void func1(){
//        var1 = 2;
        var2 = 2;
    }
    public void func2(){
        var1 = 2;
        var2 = 2;
    }
}