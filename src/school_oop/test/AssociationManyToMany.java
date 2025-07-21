package school_oop.test;

import school_oop.manager.EnrollManager;
import school_oop.model.Discipline;
import school_oop.model.Teacher;

public class AssociationManyToMany {
    public static void main(String[] args) {
        EnrollManager manager = new EnrollManager();

        Discipline discipline1 = new Discipline("Matemática", 80);
        Discipline discipline2 = new Discipline("Português", 80);

        Teacher teacher1 = new Teacher("Djonathan", 12345678, "Licenciado", 16.50);
        Teacher teacher2 = new Teacher("Daniele", 87654321, "Licenciada", 8.50);

        manager.enrollTeacherInDiscipline(teacher1, discipline1);
        manager.enrollTeacherInDiscipline(teacher1, discipline2);
        manager.enrollTeacherInDiscipline(teacher2, discipline2);

        System.out.println("Disciplinas do professor " + teacher1.getName() + ":");
        for (Discipline d : teacher1.getDisciplines().getAll()) {
            System.out.println("- " + d.getName());
        }

        System.out.println("Professores da disciplina " + discipline2.getName() + ":");
        for (Teacher t : discipline2.getTeachers().getAll()) {
            System.out.println("- " + t.getName());
        }
    }
}
