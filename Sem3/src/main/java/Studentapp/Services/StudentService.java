package Studentapp.Services;

import Studentapp.Domen.PersonComparator;
import Studentapp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName,age,count);
        count++;
        students.add(per);
    }

    public void sortByFIOStdLst()
    {
        // List<Student> newStudentList = new ArrayList<Student>(students);
        students.sort( new PersonComparator<Student>());
        //return newStudentList;
    }
}
