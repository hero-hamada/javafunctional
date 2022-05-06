package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.MALE;
import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Senku", MALE),
            new Person("Sakura", FEMALE),
            new Person("Sasuke", MALE),
            new Person("Rem", FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female: females) {
            System.out.println(female);
        }
        // Declarative approach
        people.stream()
                .filter((person) -> FEMALE.equals(person.gender))
                .toList().forEach(System.out::println);

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
