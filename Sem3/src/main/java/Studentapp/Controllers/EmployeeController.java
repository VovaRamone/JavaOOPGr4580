package Studentapp.Controllers;

import Studentapp.Domen.Employee;
import Studentapp.Services.EmployeeService;

public class EmployeeController implements iPersonController<Employee> {
    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, int age) {
        empService.create(firstName,age);
    }

    public static <T extends Employee> void paySalary(T person)
    {
        System.out.println(person.getName()+" выплачена зарплата 10000р. ");
    }
}
