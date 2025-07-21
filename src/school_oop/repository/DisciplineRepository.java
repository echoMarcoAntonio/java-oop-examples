package school_oop.repository;

import school_oop.model.Discipline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisciplineRepository {
    private final ArrayList<Discipline> disciplines = new ArrayList<>();

    public void add(Discipline discipline) {
        disciplines.add(discipline);
    }

    public int count() {
        return disciplines.size();
    }

    public void remove(Discipline discipline) {
        disciplines.remove(discipline);
    }

    public Discipline get(int index) {
        return disciplines.get(index);
    }

    public boolean contains(Discipline discipline) {
        return disciplines.contains(discipline);
    }

    public List<Discipline> getAll() {
        return Collections.unmodifiableList(disciplines);
    }
}
