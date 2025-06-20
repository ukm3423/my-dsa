// package comp;

// import java.util.*;

// class Person {
//     String name;
//     int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return name + " (" + age + ")";
//     }
// }

// class NameComparator implements Comparator<Person> {
//     @Override
//     public int compare(Person p1, Person p2) {
//         return p1.name.compareTo(p2.name);  // Sorting by name
//     }
// }

// class AgeComparator implements Comparator<Person> {
//     @Override
//     public int compare(Person p1, Person p2) {
//         return Integer.compare(p1.age, p2.age);  // Sorting by age
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         List<Person> people = new ArrayList<>();
//         people.add(new Person("Alice", 30));
//         people.add(new Person("Bob", 25));
//         people.add(new Person("Charlie", 35));

//         // Sorting by name using NameComparator
//         Collections.sort(people, new NameComparator());
//         System.out.println("Sorted by name:");
//         for (Person p : people) {
//             System.out.println(p);
//         }

//         // Sorting by age using AgeComparator
//         Collections.sort(people, new AgeComparator());
//         System.out.println("\nSorted by age:");
//         for (Person p : people) {
//             System.out.println(p);
//         }
//     }
// }
