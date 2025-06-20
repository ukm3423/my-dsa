package comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    String address;
    double salary;
    // Constructor
    Person(String name, int age, String address, double salary){
        this.name = name; 
        this.age = age; 
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", address: " + address + ", salary: " + salary;
    }
}

public class Test {
    public static void main(String[] args) {
        //Create two Person objects
        
        Person p1 = new Person("Alive", 23, "Noida", 35000);
        Person p2 = new Person("Max", 26, "Namkum", 45000);
        Person p3 = new Person("Bob", 32, "Bokaro", 55000);
        Person p4 = new Person("Ravi", 28, "Delhi", 60000);
        Person p5 = new Person("Aarti", 30, "Mumbai", 75000);
        Person p6 = new Person("Priya", 22, "Kolkata", 40000);
        Person p7 = new Person("Rahul", 25, "Chennai", 48000);
        Person p8 = new Person("Sneha", 27, "Bangalore", 52000);
        Person p9 = new Person("Vikram", 33, "Hyderabad", 67000);
        Person p10 = new Person("Geeta", 29, "Pune", 53000);

        // Create a list of people
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        // Sort by name using a Comparator (alphabetical order)
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name); // Compare by name
            }
        });

        // Output the sorted list
        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Alternatively, you can use a lambda expression to simplify the Comparator:
        Collections.sort(people, (o1, o2) -> o1.name.compareTo(o2.name));

        // Output the sorted list using lambda
        System.out.println("\nSorted by name using lambda:");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, (o1, o2) -> Double.compare(o1.salary, o2.salary) );

        // Output the sorted list using lambda
        System.out.println("\nSorted by salary using lambda:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
