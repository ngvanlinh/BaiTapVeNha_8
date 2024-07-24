package org.example;

public class UndergraduateStudent extends Student {
    public String major;


    @Override
    public double calculateGPA() {
        return 9;
    }

    public UndergraduateStudent(String name, String studentId, int age, String major) {
        super(name, studentId, age);
        this.major = major;
    }


    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Major " + major);
        System.out.println("GPA " + calculateGPA());
    }

}
