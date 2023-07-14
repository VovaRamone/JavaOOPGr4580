package StudentMVC.View;

import StudentMVC.Controller.iGetView;
import StudentMVC.Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * An English version of the view implementation for the application.
 */
public class ViewEng implements iGetView {

    /**
     * Prints all the students to the view.
     *
     * @param students The list of students to print.
     */
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------List of Students--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        String studentIdStr = prompt("Enter student number to delete:");
        try {
            return Long.parseLong(studentIdStr);
        } catch (NumberFormatException e) {
            return null; // or handle the error as needed
        }
    }


    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
}

