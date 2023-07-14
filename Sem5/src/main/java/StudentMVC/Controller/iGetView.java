package StudentMVC.Controller;

import StudentMVC.Model.Student;

import java.util.List;

/**
 * An interface for the view component of the application.
 */
public interface iGetView {
    /**
     * Prints all the students to the view.
     *
     * @param students The list of students to print.
     */
    void printAllStudents(List<Student> students);

    // Метод выводит информацию о каждом студенте на консоль
    void printAllStudent(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
}
