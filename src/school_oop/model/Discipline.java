package school_oop.model;

import school_oop.repository.SchoolClassRepository;
import school_oop.repository.TeacherRepository;

public class Discipline {
    private String name;
    private int workload;

    private final TeacherRepository teachers;
    private final SchoolClassRepository schoolClasses;

    public Discipline(String name, int workload) {
        this.name = name;
        this.workload = workload;
        teachers = new TeacherRepository();
        schoolClasses = new SchoolClassRepository();
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

    public TeacherRepository getTeachers() {
        return teachers;
    }

    public SchoolClassRepository getSchoolClasses() {
        return schoolClasses;
    }
}
