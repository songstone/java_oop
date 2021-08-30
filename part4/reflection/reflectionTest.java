package part4.reflection;

import part3.ObjectEquals.Person;

import java.lang.reflect.InvocationTargetException;

public class reflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Person person1 = new Person(1,  "01011111111");
        Object person2 = new Person(2,  "01011111111");

        person1.printPersonClass();
//        person2.printPersonClass();

        // Reflection
        Class personClass = Class.forName("part4.reflection.reflectionTest");
//        Person person3 = (Person)personClass.newInstance(); // java9에서 deprecated
        Person person3 = (Person)personClass.getDeclaredConstructor().newInstance();
        person3.printPersonClass();


    }
}
