package StudentMVC.Model;

import StudentMVC.Controller.iGetModel;

import java.util.List;

/**
 * A model implementation using a list to store students.
 */
public class ModelList implements iGetModel {
    private List<Student> students;

    /**
     * Constructs a new ModelList object with the specified list of students.
     *
     * @param students The list of students.
     */
    public ModelList(List<Student> students) {
        this.students = students;
    }

    /**
     * Retrieves all the students from the model.
     *
     * @return A list of all the students.
     */
    public List<Student> getAllStudents()
    {
        return students;
    }

    /**
     * Deletes a student with the specified ID from the model.
     *
     * @param studentId The ID of the student to delete.
     * @return {@code true} if the student was deleted successfully, {@code false} otherwise.
     */
    public boolean deleteStudent(Long studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}
