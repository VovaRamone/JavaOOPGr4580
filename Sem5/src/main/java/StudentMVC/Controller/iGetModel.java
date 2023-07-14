package StudentMVC.Controller;

import StudentMVC.Model.Student;

import java.util.List;

/**
 * An interface for the model component of the application.
 */
public interface iGetModel {
    /**
     * Gets all the students from the model.
     *
     * @return A list of all the students.
     */
    List<Student> getAllStudents();
    /**
     * Deletes a student with the specified ID from the model.
     *
     * @param studentId The ID of the student to delete.
     * @return {@code true} if the student was deleted successfully, {@code false} otherwise.
     */
    boolean deleteStudent(Long studentId);
}
