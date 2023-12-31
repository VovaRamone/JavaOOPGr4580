package Studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Studentapp.Controllers.EmployeeController;
import Studentapp.Controllers.TeacherController;
import Studentapp.Domen.*;
import Studentapp.Services.AverageAge;
import Studentapp.Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        Student s1_1 = new Student("Elon", 45, 150);
        Student s1_2 = new Student("Joe", 53, 160);
        Student s1_3 = new Student("Young Jamie", 32, 170);
        Student s1_4 = new Student("Theo",  44, 180);
        Student s1_5 = new Student("Lex",  40, 190);
        Student s1_6 = new Student("Ice",  50, 200);
        Student s1_7 = new Student("Avi",  60, 210);
        Student s1_8 = new Student("Jeremy",  41, 220);
        Student s1_9 = new Student("Robert",  69, 230);

        Student s2_1 = new Student("Егор", 35, 001);
        Student s2_2 = new Student("Ольга", 23, 002);
        Student s2_3 = new Student("Андрей", 37, 003);
        Student s2_4 = new Student("Давид",  22, 004);
        Student s2_5 = new Student("Вова",  36, 005);

        Student s3_1 = new Student("Mike", 18, 555);
        Student s3_2 = new Student("Leo", 17, 666);
        Student s3_3 = new Student("Raph", 19, 777);
        Student s3_4 = new Student("Don",  18, 888);
        Student s3_5 = new Student("Splinter",  40, 999);

        Teacher t1 = new Teacher("Eric", 48, "mathematician");
        Teacher t2 = new Teacher("Woz", 60, "programmer");
        Teacher t3 = new Teacher("Paul", 55, "mycologist");
        Teacher t4 = new Teacher("Andrew",  38, "neurobiologist");
        Teacher t5 = new Teacher("Rock",  50, "gym teacher");

        Employee e1 = new Employee("Freddy", 42, "cleaner");
        Employee e2 = new Employee("Jason", 32, "security guard");
        Employee e3 = new Employee("Ash", 55, "accountant");

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s1_1);
        listStud2.add(s1_2);
        listStud2.add(s1_3);
        listStud2.add(s1_4);
        listStud2.add(s1_5);
        listStud2.add(s1_6);
        listStud2.add(s1_7);
        listStud2.add(s1_8);
        listStud2.add(s1_9);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s2_1);
        listStud3.add(s2_2);
        listStud3.add(s2_3);
        listStud3.add(s2_4);
        listStud3.add(s2_5);

        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s3_1);
        listStud4.add(s3_2);
        listStud4.add(s3_3);
        listStud4.add(s3_4);
        listStud4.add(s3_5);

        List<Teacher> listTeach = new ArrayList<>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);
        listTeach.add(t4);
        listTeach.add(t5);

        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group1234 = new StudentGroup(listStud2, 1234);
        StudentGroup group9876 = new StudentGroup(listStud3, 9876);
        StudentGroup group7777 = new StudentGroup(listStud4, 7777);

        StudentStream studentStream = new StudentStream();
        studentStream.addStudyGroup(group4580);
        studentStream.addStudyGroup(group1234);
        studentStream.addStudyGroup(group9876);
        studentStream.addStudyGroup(group7777);

//        for(Student std : group4580)
//        {
//            System.out.println(std);
//        }
//
//        System.out.println("=========================================================");
//
//        Collections.sort(group4580.getGroup());
//
//        for(Student std: group4580.getGroup())
//        {
//            System.out.println(std);

//        // Output the groups with a list of students to the console
//        for (StudentGroup group : studentStream) {
//            System.out.println(group); // This will call the toString method of the StudentGroup class
//            List<Student> students = group.getGroup();
//            for (Student student : students) {
//                System.out.println(student); // This will call the toString method of the Student class
//            }
//            System.out.println("=========================================================");



//        // Sort the groups in the studentStream
//        Collections.sort(studentStream.getStudyGroups());
//
//        // Output the sorted groups with a list of students to the console
//        for (StudentGroup group : studentStream) {
//            System.out.println(group); // This will call the toString method of the StudentGroup class
//            List<Student> students = group.getGroup();
//            for (Student student : students) {
//                System.out.println(student); // This will call the toString method of the Student class
//            }
//            System.out.println("=========================================================");
//        }




//        // Sort the groups in the studentStream
//        Collections.sort(studentStream.getStudyGroups());
//
//        // Output the sorted groups with a list of students to the console
//        for (StudentGroup group : studentStream) {
//            System.out.println(group); // This will call the toString method of the StudentGroup class
//            List<Student> students = group.getGroup();
//            for (Student student : students) {
//                System.out.println(student); // This will call the toString method of the Student class
//            }
//            System.out.println("=========================================================");
//        }

//        // Test_1 Shows number of groups
//        System.out.println("Number of groups: " + studentStream.getStudyGroups().size());
//
//        System.out.println("=========================================================");
//
//        // Test_2 Iterate over the groups and print the group IDs
//        System.out.println("Group IDs:");
//        for (StudentGroup group : studentStream) {
//            System.out.println(group.getIdGroup());
//        }
//
//        System.out.println("=========================================================");
//
//        // Test_3 Override StudentStream
//        System.out.println(studentStream);


//        PersonComparator<Student> comS = new PersonComparator<>();
//        comS.compare(s1, s2);
//
//        Teacher t1 = new Teacher("Иван", 25, "Docent");
//        Teacher t2 = new Teacher("Игорь", 23, "Professor");
//
//        PersonComparator<Teacher> comT = new PersonComparator<>();
//        comT.compare(t1, t2);
//
//        //comS.compare(s1, t2);
//        PersonComparator<Person> comP = new PersonComparator<>();
//        comP.compare(s1, t2);
//
//        Employee e1 = new Employee("Федорович", 60, "разнорабочим");
//        //EmployeeController empControll = new EmployeeController();
//        EmployeeController.paySalary(e1);
//        // EmployeeController.paySalary(s1);
//        //empControll.paySalary(e1);
//        //empControll.paySalary(s1);

        // Add teachers to the TeacherService
        TeacherService teacherService = new TeacherService();
        teacherService.create(t1.getName(), t1.getAge());
        teacherService.create(t2.getName(), t2.getAge());
        teacherService.create(t3.getName(), t3.getAge());
        teacherService.create(t4.getName(), t4.getAge());
        teacherService.create(t5.getName(), t5.getAge());

        // Display the sorted list of teachers
        teacherService.displaySortedTeachers();

//        // Add teachers to the TeacherService
//        TeacherController teacherController = new TeacherController();
//        teacherController.create(t1.getName(), t1.getAge());
//        teacherController.create(t2.getName(), t2.getAge());
//        teacherController.create(t3.getName(), t3.getAge());
//        teacherController.create(t4.getName(), t4.getAge());
//        teacherController.create(t5.getName(), t5.getAge());
//
//        // Display the sorted list of teachers
//        TeacherService teacherService = new TeacherService();
//        teacherService.displaySortedTeachers();

        // Calculate and print the average ages
        AverageAge<Student> studentAverageAge = new AverageAge<>(listStud);
        double averageStudentAge = studentAverageAge.calculateAverageAge();
        System.out.println("Average Student Age: " + averageStudentAge);

        AverageAge<Teacher> teacherAverageAge = new AverageAge<>(listTeach);
        double averageTeacherAge = teacherAverageAge.calculateAverageAge();
        System.out.println("Average Teacher Age: " + averageTeacherAge);

        AverageAge<Employee> employeeAverageAge = new AverageAge<>(listEmp);
        double averageEmployeeAge = employeeAverageAge.calculateAverageAge();
        System.out.println("Average Employee Age: " + averageEmployeeAge);
    }
}
