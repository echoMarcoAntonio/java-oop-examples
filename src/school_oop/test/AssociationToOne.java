package school_oop.test;

import school_oop.manager.EnrollManager;
import school_oop.model.SchoolClass;
import school_oop.model.Student;

import java.time.LocalDate;

public class AssociationToOne {
    public static void main(String[] args) {
        EnrollManager manager = new EnrollManager();

        SchoolClass classGroup = new SchoolClass("1A", 2019);
        Student malaquias = new Student("Malaquias Leonardo", 12354678, LocalDate.of(2001, 5, 12));
        Student kerolayne = new Student("Kerolayne Lorraine Veganandry", 14354432, LocalDate.of(2002, 2, 27));

        manager.enrollStudentInSchoolClass(malaquias, classGroup);
        manager.enrollStudentInSchoolClass(kerolayne, classGroup);

        System.out.println("Alunos da turma " + classGroup.getAcronym() + ":");
        for (Student s : classGroup.getStudents().getAll()) {
            System.out.println("- " + s.getName());
        }
    }
}
