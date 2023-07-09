package Studentapp.Services;

import Studentapp.Domen.PersonComparator;
import Studentapp.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher teacher = new Teacher(firstName, age, "");
        teachers.add(teacher);
    }

    // Display Teachers (sorted)
    public void displaySortedTeachers() {
        teachers.sort(new PersonComparator<>());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
