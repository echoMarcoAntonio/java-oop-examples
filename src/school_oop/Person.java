package school_oop;

public class Person {
    private String name;
    private int registrationNumber;

    public Person(String name, int registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name != null) {
            this.name = name;
        } else {
            System.out.println("O nome não pode ser nulo.");
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber + "".length() >= 4) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Número de matrícula não atende os requisítos. Deve possuir 4 ou mais caracteres.");
        }
    }
}
