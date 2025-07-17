package school_oop;

import java.util.ArrayList;

public class Teacher extends Person {
    private String academicDegree;
    private double salary;

    ArrayList<Discipline> disciplines;

    ArrayList<schoolClass> schoolClasses;

    public Teacher(String name, int registrationNumber, String academicDegree, double salary) {
        super(name, registrationNumber);
        this.academicDegree = academicDegree;
        this.salary = salary;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TO-DO: applyTest():void
}
