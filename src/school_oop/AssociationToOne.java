package school_oop;

import java.time.LocalDate;

public class AssociationToOne {
    public static void main(String[] args) {
        SchoolClass classGroup = new SchoolClass("1A", 2019);

        Student malaquias = new Student("Malaquias Leonardo", 123546,  LocalDate.of(2001, 5, 12));
        malaquias.setSchoolClass(classGroup);
        classGroup.addStudent(malaquias);

        Student kerolayne = new Student("Kerolayne Lorraine Veganandry", 143544,  LocalDate.of(2002, 2, 27));
        kerolayne.setSchoolClass(classGroup);
        classGroup.addStudent(kerolayne);

        System.out.println("Dados do aluno 1:");
        System.out.println("Aluno: " + malaquias.getName());
        System.out.println("Turma: " + malaquias.getSchoolClass().getAcronym());

        System.out.println("\nAlunos da turma:");
        for (int i = 0; i < classGroup.countStudents(); i++) {
            System.out.println("Aluno: " + classGroup.getStudent(i).getName());
        }
    }
}
