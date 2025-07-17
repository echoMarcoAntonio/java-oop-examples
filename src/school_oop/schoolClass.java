package school_oop;

import java.time.LocalDate;
import java.util.ArrayList;

public class schoolClass {
    private String acronym;
    private int year;

    ArrayList<Student> students;

    ArrayList<Teacher> teachers;

    ArrayList<Discipline> disciplines;

    public schoolClass(String acronym, int year) {
        this.acronym = acronym;
        this.year = year;
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

    //TO-DO: addStudent():void
}
