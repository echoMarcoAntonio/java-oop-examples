package school_oop.model;

import java.time.LocalDate;

public class Student extends Person {
    private LocalDate birthDate;

    private SchoolClass schoolClass;

    public Student(String name, int registrationNumber, LocalDate birthDate) {
        super(name, registrationNumber);
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    //TO-DO: doTest():void
}
