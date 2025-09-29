//  Part B: Filtering and Sorting Students Using Streams

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aman", 80),
            new Student("Riya", 70),
            new Student("Karan", 90),
            new Student("Neha", 60),
            new Student("Simran", 85)
        );

        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingInt(s -> s.marks))
            .map(s -> s.name)
            .collect(Collectors.toList());

        topStudents.forEach(System.out::println);
    }
}
