package labs.patterns.behavioral.strategy;

import labs.patterns.behavioral.strategy.enteties.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Alfred", 28);
        Person person2 = new Person("Bert", 18);
        Person person3 = new Person("Charlie", 38);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println("=== Sorting by Name ===");
        List<Person> copy = new ArrayList<>(people);
        Collections.sort(copy, new NameComparator());
        copy.forEach(person ->
                System.out.println(person.name() + " is " + person.age() + " years old"));
        System.out.println("\n");

        System.out.println("=== Sorting by Age ===");
        List<Person> copy2 = new ArrayList<>(people);
        Collections.sort(copy2, new AgeComparator());
        copy2.forEach(person ->
                System.out.println(person.name() + " is " + person.age() + " years old"));
    }

}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name().compareTo(o2.name());
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age(), o2.age());
    }
}

