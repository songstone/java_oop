package part4.compare;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Setter
@Getter
public class Person implements Comparable<Person> {
    private int id;
    private String phoneNumber;

    public Person(int id, String phoneNumber) {
        super();
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return String.format("Person [id=%d | phoneNumber=%s]", id, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        return result;
    }

    public void printPersonClass(){
        System.out.println("Person 클래스입니다.");
    }

    @Override
    public int compareTo(Person person) {
        return (this.id - person.id);   //오름차순
//        return (this.id - person.id) *  (-1);   //내림 차순
    }
}