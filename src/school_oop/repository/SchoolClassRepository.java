package school_oop.repository;

import school_oop.model.SchoolClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolClassRepository {
    private final ArrayList<SchoolClass> schoolClasses = new ArrayList<>();

    public void add(SchoolClass schoolClass) {
        schoolClasses.add(schoolClass);
    }

    public int count() {
        return schoolClasses.size();
    }

    public void remove(SchoolClass schoolClass) {
        schoolClasses.remove(schoolClass);
    }

    public SchoolClass get(int index) {
        return schoolClasses.get(index);
    }

    public boolean contains(SchoolClass schoolClass) {
        return schoolClasses.contains(schoolClass);
    }

    public List<SchoolClass> getAll() {
        return Collections.unmodifiableList(schoolClasses);
    }
}
