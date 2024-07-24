package org.example;

public class GraduateStudent extends Student {
    public String researchTopic;


    @Override
    public double calculateGPA() {
        return 8;
    }


    public GraduateStudent(String name, String studentId, int age, String researchTopic) {
        super(name, studentId, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("researchTopic  " + researchTopic);
        System.out.println("GPA " + calculateGPA());
    }
}
