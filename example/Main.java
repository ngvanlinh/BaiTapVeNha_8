package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {University university = new University();
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Nguyễn Văn A", "MSV0001", 24, "IT");
        GraduateStudent graduateStudent = new GraduateStudent("Nguyễn Văn B", "MSV002", 23, "abcde");
        InternationalStudent internationalStudent = new InternationalStudent("Nguyễn Thị C", "MSV003", 21, "nahdada", "Viet Nam");


        university.addStudent(undergraduateStudent);
        university.addStudent(graduateStudent);
        university.addStudent(internationalStudent);

        university.displayAllStudent();


    }
}