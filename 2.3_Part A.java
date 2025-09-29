// Part A: Sorting Employee Objects Using Lambda Expressions

import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Aman", 25, 50000));
        list.add(new Employee("Riya", 30, 60000));
        list.add(new Employee("Karan", 22, 45000));
        list.add(new Employee("Neha", 28, 55000));

        System.out.println("Sorted by Name:");
        list.sort((e1, e2) -> e1.name.compareTo(e2.name));
        list.forEach(System.out::println);

        System.out.println("\nSorted by Age:");
        list.sort((e1, e2) -> Integer.compare(e1.age, e2.age));
        list.forEach(System.out::println);

        System.out.println("\nSorted by Salary (Descending):");
        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        list.forEach(System.out::println);
    }
}
