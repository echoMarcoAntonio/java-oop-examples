package school_oop;

import java.util.ArrayList;

public class Teacher extends Person {
    private String academicDegree;
    private double salary;

    private ArrayList<Discipline> disciplines;

    private ArrayList<SchoolClass> schoolClasses;

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

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public ArrayList<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(ArrayList<SchoolClass> SchoolClasses) {
        this.schoolClasses = SchoolClasses;
    }

    //TO-DO: applyTest():void
}
