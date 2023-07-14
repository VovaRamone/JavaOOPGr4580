package StudentMVC;

import StudentMVC.Controller.Controller;
import StudentMVC.Controller.iGetModel;
import StudentMVC.Controller.iGetView;
import StudentMVC.Model.HashModel;
import StudentMVC.Model.ModelFile;
import StudentMVC.Model.ModelList;
import StudentMVC.Model.Student;
import StudentMVC.View.View;
import StudentMVC.View.ViewEng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The main class that runs the application.
 */
public class App {
    /**
     * The entry point of the application.
     *
     * @param args The command-line arguments.
     * @throws Exception If an exception occurs.
     */
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select language (1 - Russian, 2 - English):");
        int languageChoice = scanner.nextInt();

        iGetView view;
        if (languageChoice == 1) {
            view = new View();
        } else if (languageChoice == 2) {
            view = new ViewEng();
        } else {
            System.out.println("Invalid language choice. Defaulting to Russian.");
            view = new View();
        }

        // Creating a list of students
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей",  21, 101);
        Student s2 = new Student("Андрей",  22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша",  25, 171);
        Student s6 = new Student("Лена",  23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        // Creating a HashModel instance
        HashModel modelHash = new HashModel();
        modelHash.addStudent(new Student("John", 20, 201));
        modelHash.addStudent(new Student("Alice", 22, 202));
        modelHash.addStudent(new Student("Bob", 21, 203));

        // Creating a ModelFile instance
        ModelFile fModel = new ModelFile("StudentDB.txt");
        //fModel.saveAllStudentToFile(students);

        // Creating instances of the model interfaces
        iGetModel modelFile = fModel;
        iGetModel hashModel = modelHash;
        iGetModel model = new ModelList(students);

        // Creating an instance of the view interface (Russian version)
        //iGetView view = new View();

        // Creating an instance of the view interface (English version)
        //iGetView view = new ViewEng();

        // Creating a controller instance with ModelFile
        //Controller control = new Controller(modelFile, view);

        // Creating a controller instance with HashModel
        Controller control = new Controller(hashModel, view);

        control.update();
        control.run();
    }
}