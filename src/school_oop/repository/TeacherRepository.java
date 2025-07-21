package school_oop.repository;

import school_oop.model.Teacher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherRepository {
    private final ArrayList<Teacher> teachers = new ArrayList<>();

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public int count() {
        return teachers.size();
    }

    public void remove(Teacher teacher) {
        teachers.remove(teacher);
    }

    public Teacher get(int index) {
        return teachers.get(index);
    }

    public boolean contains(Teacher teacher) {
        return teachers.contains(teacher);
    }

    public List<Teacher> getAll() {
        return Collections.unmodifiableList(teachers);
    }
}
