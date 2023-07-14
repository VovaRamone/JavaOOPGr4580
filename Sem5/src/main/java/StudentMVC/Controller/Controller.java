package StudentMVC.Controller;

import StudentMVC.Model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * The controller class that handles the logic between the model and view.
 */
public class Controller {

    //NEW
    private List<iGetModel> models; // List of models to search

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    /**
     * Constructs a new Controller object.
     *
     * @param model The model to be used.
     * @param view  The view to be used.
     */
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Updates the view with the data from the model.
     */
    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
            view.printAllStudents(students);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**
     * Runs the main loop of the application.
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    Long studentId = view.getStudentIdToDelete();
                    boolean deleted = model.deleteStudent(studentId);
                    if (deleted) {
                        System.out.println("Студент удален успешно.");
                    } else {
                        System.out.println("Студент с таким номером не найден.");
                    }
                    break;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
        }
    }
}
