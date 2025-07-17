package school_oop;

import java.time.LocalDate;

public class schoolClass {
    private String acronym;
    private int year;

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

    //TO-DO: adicionarAluno():void
}
