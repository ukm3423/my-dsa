public class Student {
    static int totalStudents = 0;  // Static variable
    String name;                   // Instance variable

    public Student(String name) {
        this.name = name;
        totalStudents++;  // Every time a new student is created, this counter increases
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anupam"); 

        System.out.println(totalStudents);
        Student s2 = new Student("Rani");
        System.out.println(totalStudents);

        

    }
}
