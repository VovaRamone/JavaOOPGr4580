package Studentapp.Services;

import Studentapp.Domen.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> emploees;
    public EmployeeService() {
        this.emploees = new ArrayList<Employee>();
    }
    @Override
    public List<Employee> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}
