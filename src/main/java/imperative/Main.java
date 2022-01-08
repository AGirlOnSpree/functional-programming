package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vinita", Gender.FEMALE),
                new Person("Jasmine", Gender.FEMALE),
                new Person("Anoop", Gender.MALE),
                new Person("Anmol", Gender.MALE),
                new Person("Nitika", Gender.FEMALE),
                new Person("Tanvi", Gender.FEMALE)
        );

        System.out.println("Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach");
        //Declarative approach
        Predicate<Person> personPredicate = person -> person.gender.equals(Gender.FEMALE);
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
