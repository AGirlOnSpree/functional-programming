package streams;


import java.util.List;
import java.util.function.Predicate;

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

        //Printing the name lengths of each person in the list
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //Check if all are females
        Predicate<Person> checkIfContainsOnlyFemales = person -> person.gender.equals(FEMALE);
        boolean containsOnlyFemales = people.stream()
                .allMatch(checkIfContainsOnlyFemales);
        System.out.println(containsOnlyFemales);

        //Check if any are females
        boolean containsAnyFemales = people.stream()
                .anyMatch(checkIfContainsOnlyFemales);
        System.out.println(containsAnyFemales);

        //Check if none are females
        boolean containsNoFemales = people.stream()
                .noneMatch(checkIfContainsOnlyFemales);
        System.out.println(containsNoFemales);
        
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
