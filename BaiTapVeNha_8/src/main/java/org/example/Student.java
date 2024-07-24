package org.example;

abstract class Student {
    public String name;
    public String studentId;
    public int age;

    public abstract double calculateGPA();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student() {
    }

    public Student(String name, String studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
    }
}
