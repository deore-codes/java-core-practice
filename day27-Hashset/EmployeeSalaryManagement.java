import java.util.*;

class Employee {

    private int employeeId;
    private String name;
    private double basicSalary;
    private String department;

    Employee(int employeeId, String name,
             double basicSalary, String department) {

        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public double calculateHRA() {
        return basicSalary * 0.20;
    }

    public double calculateDA() {
        return basicSalary * 0.10;
    }

    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("---------------------------");
    }
}

public class EmployeeSalaryManagement {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(
                new Employee(101, "Sandesh", 30000, "IT")
        );

        employees.add(
                new Employee(102, "Rahul", 40000, "Finance")
        );

        employees.add(
                new Employee(103, "Amit", 35000, "HR")
        );

        Employee highestSalaryEmployee = employees.get(0);

        for (Employee employee : employees) {

            if (employee.calculateGrossSalary()
                    > highestSalaryEmployee.calculateGrossSalary()) {

                highestSalaryEmployee = employee;
            }
        }

        System.out.println("Employee with Highest Gross Salary:");
        highestSalaryEmployee.displayDetails();
    }
}