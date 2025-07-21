package school_oop.repository;

import school_oop.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRepository {
    private final ArrayList<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public int count() {
        return students.size();
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public List<Student> getAll() {
        return Collections.unmodifiableList(students);
    }
}
