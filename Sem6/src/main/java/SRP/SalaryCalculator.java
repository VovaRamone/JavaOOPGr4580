package SRP;

public class SalaryCalculator {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25); // Calculate tax in a different way if needed
        return employee.getBaseSalary() - tax;
    }
}

