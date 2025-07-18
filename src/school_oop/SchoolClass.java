package school_oop;

import java.util.ArrayList;

public class SchoolClass {
    private String acronym;
    private int year;

    private final ArrayList<Student> studentList;
    private final ArrayList<Teacher> teacherList;
    private final ArrayList<Discipline> disciplineList;

    public SchoolClass(String acronym, int year) {
        this.acronym = acronym;
        this.year = year;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.disciplineList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public int countStudents() {
        return studentList.size();
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public int countTeachers() {
        return teacherList.size();
    }

    public void removeTeacher(Teacher teacher) {
        teacherList.remove(teacher);
    }

    public Teacher getTeacher(int index){
        return teacherList.get(index);
    }

    public void addDiscipline(Discipline discipline) {
        disciplineList.add(discipline);
    }

    public int countDisciplines() {
        return disciplineList.size();
    }

    public void removeDiscipline(Discipline discipline) {
        disciplineList.remove(discipline);
    }

    public Discipline getDiscipline(int index){
        return disciplineList.get(index);
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
}
