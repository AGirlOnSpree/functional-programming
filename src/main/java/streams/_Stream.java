package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vinita", FEMALE),
                new Person("Jasmine", FEMALE),
                new Person("Anoop", MALE),
                new Person("Anmol", MALE),
                new Person("Nitika", FEMALE),
                new Person("Tanvi", FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
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
