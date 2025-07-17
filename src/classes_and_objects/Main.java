package classes_and_objects;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Journal jornalNovo = new Journal(
                "História Hoje",
                "Editora Bacana",
                "1234-5678",
                LocalDate.of(2025, 7, 17),
                12.50,
                120
        );

        jornalNovo.printInfo();
    }
}
