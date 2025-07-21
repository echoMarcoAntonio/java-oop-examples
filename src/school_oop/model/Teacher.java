package school_oop.model;

import school_oop.repository.DisciplineRepository;
import school_oop.repository.SchoolClassRepository;

public class Teacher extends Person {
    private String academicDegree;
    private double salary;

    private final DisciplineRepository disciplines;
    private final SchoolClassRepository schoolClasses;

    public Teacher(String name, int registrationNumber, String academicDegree, double salary) {
        super(name, registrationNumber);
        this.academicDegree = academicDegree;
        this.salary = salary;
        this.disciplines = new DisciplineRepository();
        this.schoolClasses = new SchoolClassRepository();
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

    public DisciplineRepository getDisciplines() {
        return disciplines;
    }

    public SchoolClassRepository getSchoolClasses() {
        return schoolClasses;
    }

    //TO-DO: applyTest():void
}
