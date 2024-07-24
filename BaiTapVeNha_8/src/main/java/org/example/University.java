package org.example;

import java.util.ArrayList;
import java.util.List;

public class University {
    public List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudent() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("===================================");
        }
    }


}
