package part3.ObjectEquals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
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
}