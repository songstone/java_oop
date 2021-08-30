package part4.reflection;

public class BindingTest {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Children();

        // Static Binding
        System.out.println(parent1.name);
        System.out.println(parent2.name);
        parent1.staticMethod();
        parent2.staticMethod();

        // Dynamic Binding
        parent1.instanceMethod();
        parent2.instanceMethod();

        // Children 클래스의 staticMethod()
        ((Children)parent2).staticMethod();
        Children.staticMethod();
    }
}
