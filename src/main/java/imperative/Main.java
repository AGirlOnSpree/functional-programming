package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vinita", FEMALE),
                new Person("Jasmine", FEMALE),
                new Person("Anoop", MALE),
                new Person("Anmol", MALE),
                new Person("Nitika", FEMALE),
                new Person("Tanvi", FEMALE)
        );

        System.out.println("Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(FEMALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach");
        //Declarative approach
        Predicate<Person> personPredicate = person -> person.gender.equals(FEMALE);
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
