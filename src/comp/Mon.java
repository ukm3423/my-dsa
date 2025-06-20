// package comp;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Person implements Comparable<Person>{
//     String name;
//     int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public int compareTo(Person other) {
//         // return Integer.compare(this.age, other.age);  // Sorting by age
//         return this.name.compareTo(other.name);  // Sorting by name (alphabetically)
//         // return Integer.compare(other.age, this.age);  // Sorting in descending order by age (oldest first)
//     }

//     @Override
//     public String toString() {
//         return name + " (" + age + ")";
//     }
// }

// public class Mon {
//     public static void main(String[] args) {
//         List<Person> people = new ArrayList<>();
//         people.add(new Person("Charlie", 35));

//         people.add(new Person("Alice", 30));
//         people.add(new Person("Bob", 25));

//         Collections.sort(people);  // Sorting by age
//         for (Person p : people) {
//             System.out.println(p);
//         }


//     }
// }
