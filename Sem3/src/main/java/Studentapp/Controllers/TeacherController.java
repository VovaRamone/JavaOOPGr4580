package Studentapp.Controllers;

import Studentapp.Domen.Teacher;
import Studentapp.Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, int age) {
        teacherService.create(firstName, age);
        teacherService.displaySortedTeachers();
    }
}
