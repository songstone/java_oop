package part4.compare;

import part2.Solution;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        PersonTreeSet memberTreeSet = new PersonTreeSet();

        Person p1 = new Person(1003, "원혜린");
        Person p2 = new Person(1001, "전형주");
        Person p3 = new Person(1002, "강지은");

        memberTreeSet.addPerson(p1);
        memberTreeSet.addPerson(p2);
        memberTreeSet.addPerson(p3);
        memberTreeSet.showAllPerson();

    }
}
