package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        String names[] = {"Rahul","Umesh","Raju","Devyanshu"};
        int age[] = {28,26,22,29};

        List<Person> list = new ArrayList<>(); 
        for(int i=0; i<names.length; i++){
            list.add(new Person(names[i], age[i]));
        }
        System.out.println(list);
        list.sort((a, b) -> b.age - a.age);
        String[] sortedNames = new String[names.length]; 
        for(int i=0; i<names.length; i++){
            sortedNames[i] = list.get(i).name; 
        }
        for(String s : sortedNames) System.out.println(s);
    }

    static class Person{
        String name; 
        int age; 

        Person(String name, int age){
            this.name = name; 
            this.age = age;
        }
        @Override
        public String toString() {
            return "Name : "+name+", Age : "+age;
        }
    }
}
