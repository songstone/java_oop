package part4.reflection;

public class Parent {
    public String name = "부모";

    public static void staticMethod() {
        System.out.println("부모 클래스의 정적 메서드 입니다.");
    }

    public void instanceMethod(){
        System.out.println("부모 클래스의 인스턴스 메서드 입니다.");
    }

}