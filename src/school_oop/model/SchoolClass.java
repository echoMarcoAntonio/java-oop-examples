package school_oop.model;

import school_oop.repository.DisciplineRepository;
import school_oop.repository.StudentRepository;
import school_oop.repository.TeacherRepository;

public class SchoolClass {
    private String acronym;
    private int year;

    private final StudentRepository students;
    private final TeacherRepository teachers;
    private final DisciplineRepository disciplines;

    public SchoolClass(String acronym, int year) {
        this.acronym = acronym;
        this.year = year;
        this.students = new StudentRepository();
        this.teachers = new TeacherRepository();
        this.disciplines = new DisciplineRepository();
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public StudentRepository getStudents() {
        return students;
    }

    public TeacherRepository getTeachers() {
        return teachers;
    }

    public DisciplineRepository getDisciplines() {
        return disciplines;
    }
}
