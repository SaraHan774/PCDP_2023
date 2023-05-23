package edu.coursera.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsClass {

    public static void main(String[] args) {
        Person person = new Person("Name 1");
        Person person1 = new Person("Name 2");
        Person person2 = new Person("Name 3");
        Person person3 = new Person("Name 4");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());
        Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        String joined = people.stream().map(Object::toString).collect(Collectors.joining(", "));

    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
