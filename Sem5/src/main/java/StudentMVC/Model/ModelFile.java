package StudentMVC.Model;

import StudentMVC.Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * A model implementation that stores students in a file.
 */
public class ModelFile  implements iGetModel {
    private String fileName;

    /**
     * Constructs a new ModelFile object with the specified file name.
     *
     * @param fileName The name of the file.
     */
    public ModelFile(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Retrieves all the students from the model file.
     *
     * @return A list of all the students.
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    /**
     * Deletes a student with the specified ID from the model file.
     *
     * @param studentId The ID of the student to delete.
     * @return {@code true} if the student was deleted successfully, {@code false} otherwise.
     */
    public boolean deleteStudent(Long studentId) {
        List<Student> students = getAllStudents();
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                saveAllStudentToFile(students);
                return true;
            }
        }
        return false;
    }

    /**
     * Saves all the students to the model file.
     *
     * @param students The list of students to save.
     */
    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
