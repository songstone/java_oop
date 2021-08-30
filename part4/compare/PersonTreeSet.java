package part4.compare;

import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonTreeSet {
    private TreeSet<Person> treeSet;

    public PersonTreeSet(){
        treeSet = new TreeSet<>();
    }

    public void addPerson(Person person){
        treeSet.add(person);
    }

    public boolean removePerson(int personId){

        Iterator<Person> ir = treeSet.iterator();

        while( ir.hasNext()){
            Person Person = ir.next();
            int tempId = Person.getId();
            if( tempId == personId){
                treeSet.remove(Person);
                return true;
            }
        }

        System.out.println(personId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllPerson(){
        for(Person Person : treeSet){
            System.out.println(Person);
        }
        System.out.println();
    }
}
