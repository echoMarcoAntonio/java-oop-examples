package school_oop;

import java.time.LocalDate;

public class Student extends Person {
    private LocalDate birthDate;

    private schoolClass schoolClass;

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

    //TO-DO: doTest():void
}
