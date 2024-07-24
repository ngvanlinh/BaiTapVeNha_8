package org.example;

public class InternationalStudent extends UndergraduateStudent {
    public String country;

    public InternationalStudent(String name, String studentId, int age, String major, String country) {
        super(name, studentId, age, major);
        this.country = country;
    }

    @Override
    public double calculateGPA() {
        return 7;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Country: " + country);
    }
}
