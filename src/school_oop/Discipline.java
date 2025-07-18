package school_oop;

import java.util.ArrayList;

public class Discipline {
    private String name;
    private int workload;

    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> schoolClasses;

    public Discipline(String name, int workload) {
        this.name = name;
        this.workload = workload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(ArrayList<SchoolClass> SchoolClasses) {
        this.schoolClasses = SchoolClasses;
    }
}
