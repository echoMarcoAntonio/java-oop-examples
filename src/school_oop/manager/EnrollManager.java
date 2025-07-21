package school_oop.manager;

import school_oop.model.Discipline;
import school_oop.model.SchoolClass;
import school_oop.model.Student;
import school_oop.model.Teacher;

public class EnrollManager {

    // Teacher ↔ Discipline
    public void enrollTeacherInDiscipline(Teacher teacher, Discipline discipline) {
        if (!teacher.getDisciplines().contains(discipline)) {
            teacher.getDisciplines().add(discipline);
        }
        if (!discipline.getTeachers().contains(teacher)) {
            discipline.getTeachers().add(teacher);
        }
    }

    public void unenrollTeacherFromDiscipline(Teacher teacher, Discipline discipline) {
        teacher.getDisciplines().remove(discipline);
        discipline.getTeachers().remove(teacher);
    }

    // Teacher ↔ SchoolClass
    public void enrollTeacherInSchoolClass(Teacher teacher, SchoolClass schoolClass) {
        if (!teacher.getSchoolClasses().contains(schoolClass)) {
            teacher.getSchoolClasses().add(schoolClass);
        }
        if (!schoolClass.getTeachers().contains(teacher)) {
            schoolClass.getTeachers().add(teacher);
        }
    }

    public void unenrollTeacherFromSchoolClass(Teacher teacher, SchoolClass schoolClass) {
        teacher.getSchoolClasses().remove(schoolClass);
        schoolClass.getTeachers().remove(teacher);
    }

    // Discipline ↔ SchoolClass
    public void enrollDisciplineInSchoolClass(Discipline discipline, SchoolClass schoolClass) {
        if (!discipline.getSchoolClasses().contains(schoolClass)) {
            discipline.getSchoolClasses().add(schoolClass);
        }
        if (!schoolClass.getDisciplines().contains(discipline)) {
            schoolClass.getDisciplines().add(discipline);
        }
    }

    public void unenrollDisciplineFromSchoolClass(Discipline discipline, SchoolClass schoolClass) {
        discipline.getSchoolClasses().remove(schoolClass);
        schoolClass.getDisciplines().remove(discipline);
    }

    // Student ↔ SchoolClass
    public void enrollStudentInSchoolClass(Student student, SchoolClass schoolClass) {
        student.setSchoolClass(schoolClass);
        if (!schoolClass.getStudents().contains(student)) {
            schoolClass.getStudents().add(student);
        }
    }

    public void unenrollStudentFromSchoolClass(Student student, SchoolClass schoolClass) {
        student.setSchoolClass(null);
        schoolClass.getStudents().remove(student);
    }
}
