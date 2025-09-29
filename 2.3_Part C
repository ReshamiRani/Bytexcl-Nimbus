//  Part C: Menu-Based Employee Management System Using File Handling

import java.io.*;
import java.util.*;

class Employee {
    String name;
    int id;
    String designation;
    double salary;

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
        return id + "," + name + "," + designation + "," + salary;
    }

    public static Employee fromString(String line) {
        String[] parts = line.split(",");
        return new Employee(parts[1], Integer.parseInt(parts[0]), parts[2], Double.parseDouble(parts[3]));
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "employees.txt";

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                Employee emp = new Employee(name, id, designation, salary);
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                    writer.write(emp.toString());
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            } else if (choice == 2) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(filename));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        Employee emp = Employee.fromString(line);
                        System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Designation: " + emp.designation + ", Salary: " + emp.salary);
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
