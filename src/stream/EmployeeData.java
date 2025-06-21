package stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("E101", "Aarav Sharma", "aarav.sharma@example.com", 9876543210L, 55000.0, "123 MG Road, Mumbai", true),
            new Employee("E102", "Ishita Patel", "ishita.patel@example.com", 9876543209L, 62000.0, "456 Gokuldham, Ahmedabad", true),
            new Employee("E103", "Ravi Kumar", "ravi.kumar@example.com", 9876543208L, 47000.0, "789 Kothrud, Pune", false),
            new Employee("E104", "Neha Gupta", "neha.gupta@example.com", 9876543207L, 54000.0, "101 Rajaji Nagar, Bangalore", true),
            new Employee("E105", "Siddharth Verma", "siddharth.verma@example.com", 9876543206L, 67000.0, "202 Salt Lake, Kolkata", false),
            new Employee("E106", "Priya Reddy", "priya.reddy@example.com", 9876543205L, 59000.0, "303 Jubilee Hills, Hyderabad", true),
            new Employee("E107", "Ananya Rao", "ananya.rao@example.com", 9876543204L, 75000.0, "404 Baner Road, Pune", true),
            new Employee("E108", "Vishal Desai", "vishal.desai@example.com", 9876543203L, 50000.0, "505 Banjara Hills, Hyderabad", false),
            new Employee("E109", "Pooja Singh", "pooja.singh@example.com", 9876543202L, 53000.0, "606 Connaught Place, Delhi", true),
            new Employee("E110", "Manoj Yadav", "manoj.yadav@example.com", 9876543201L, 62000.0, "707 DLF Phase 5, Gurgaon", true)
        );
    }
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        
        employees.stream().map(Employee::getName).forEach(System.out::println);


        // Filter Active Employees
        employees.stream().filter(Employee::isIsActive).forEach(e -> System.out.println(e));

        //Sort Employees by Salary (Ascending)
        // employees.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(emp -> System.out.println(emp.getName() +" : "+emp.getSalary()));

        // Sort Employees by Salary (Descending)
        // employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(e -> System.out.println(e.getName()+" : "+e.getSalary()));

        employees.stream().filter(Employee::isIsActive).sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(e -> System.out.println(e.getName()+ " : "+e.getSalary()));;

        // Get the Average Salary of Active Employees
        Double averageSalary = employees.stream().filter(Employee::isIsActive).mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("Average Salary of Active Employees : "+averageSalary);

        // Get a List of Employee Names
        List<String> empNames = employees.stream().map(Employee::getName).toList();
        for (String name : empNames) System.out.println(name);

        // Count the Number of Active Employees
        Long activeEmployee = employees.stream().filter(Employee::isIsActive).count();
        System.out.println("No of Active employees : "+activeEmployee);

    }
}
