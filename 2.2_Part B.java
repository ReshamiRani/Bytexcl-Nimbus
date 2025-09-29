//  Part B: Serialization and Deserialization of a Student Object

import java.io.*;

class Student implements Serializable {
    int studentID;
    String name;
    double grade;

    Student(int studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }
}

public class StudentData {
    public static void main(String[] args) {
        Student s = new Student(101, "Aman", 89.5);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
            out.writeObject(s);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.dat"));
            Student loaded = (Student) in.readObject();
            in.close();

            System.out.println("Student ID: " + loaded.studentID);
            System.out.println("Name: " + loaded.name);
            System.out.println("Grade: " + loaded.grade);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
