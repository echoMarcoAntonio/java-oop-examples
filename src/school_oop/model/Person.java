package school_oop.model;

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
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("O nome não pode ser nulo.");
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (String.valueOf(registrationNumber).length() >= 8) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Número de matrícula inválido. Deve ter 8 dígitos.");
        }
    }
}
