package school_oop.test;

import school_oop.model.Person;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Guilhermo", 23765432);
        System.out.println("Nome: " + p1.getName());
        System.out.println("Matrícula: " + p1.getRegistrationNumber());

        // Testando setter com matrícula inválida:
        p1.setRegistrationNumber(1234); // Deve imprimir erro

        // Testando mudança de nome
        p1.setName("Maria");
        System.out.println("Nome atualizado: " + p1.getName());

        p1.setRegistrationNumber(12341234);
    }
}
