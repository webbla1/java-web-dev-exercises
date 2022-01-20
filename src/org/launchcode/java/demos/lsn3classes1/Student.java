package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructors
    public Student(String name, int studentId, int numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    public Student(String name, int studentId) {
//        this(name, studentId, numberOfCredits: 0, gpa: 0);
//    }
//
//    public Student(String name) {
//        this(name, nextStudentId);
//        nextStudentId++;
//    }
//
//    public String studentInfo() {
//        return (this.name + " has a GPA of: " + this.gpa);
//    }

    // getters and setters omitted
    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // student Id
    public int getStudentId() {
        return this.studentId;
    }

    public void setName(int studentId) {
        this.studentId = studentId;
    }

    //credits
    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    //gpa
    public double getGpa() {
        return this.studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}