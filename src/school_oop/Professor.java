package school_oop;

public class Professor extends Person {
    private String academicDegree;
    private double salary;

    public Professor(String name, int registrationNumber, String academicDegree, double salary) {
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

    //TO-DO: aplicarAvaliacao():void
}
