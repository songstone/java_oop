package part4.reflection;

public class Children extends Parent{
    public String name = "자식";

    public static void staticMethod() {
        System.out.println("자식 클래스의 정적 메서드 입니다.");
    }

    @Override
    public void instanceMethod(){
        System.out.println("자식 클래스의 인스턴스 메서드 입니다.");
    }


}