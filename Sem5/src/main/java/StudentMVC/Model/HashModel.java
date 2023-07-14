package StudentMVC.Model;

import StudentMVC.Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A model implementation using a HashMap to store students.
 */
public class HashModel implements iGetModel {

    private HashMap<Long, Student> studentsMap;

    /**
     * Constructs a new HachModel object.
     */
    public HashModel() {
        studentsMap = new HashMap<>();
    }

    /**
     * Retrieves all the students from the model.
     *
     * @return A list of all the students.
     */
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    /**
     * Adds a student to the model.
     *
     * @param student The student to add.
     */
    public void addStudent(Student student) {
        studentsMap.put((long) student.getId(), student);
    }

    /**
     * Removes a student from the model.
     *
     * @param student The student to remove.
     */
    public void removeStudent(Student student) {
        studentsMap.remove((long) student.getId());
    }

    /**
     * Deletes a student with the specified ID from the model.
     *
     * @param studentId The ID of the student to delete.
     * @return {@code true} if the student was deleted successfully, {@code false} otherwise.
     */
    @Override
    public boolean deleteStudent(Long studentId) {
        if (studentsMap.containsKey(studentId)) {
            studentsMap.remove(studentId);
            return true;
        }
        return false;
    }
}
