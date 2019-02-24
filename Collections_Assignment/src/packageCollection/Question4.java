package packageCollection;

import java.util.*;

// Question 4 Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
class Employee {
    Double eAge;
    Double eSalary;
    String eName;

    public Employee(Double eAge, Double eSalary, String eName) {
        this.eAge = eAge;
        this.eSalary = eSalary;
        this.eName = eName;
    }

    public Double getAge() {
        return eAge;
    }

    public void setAge(Double eAge) {
        this.eAge = eAge;
    }

    public Double getSalary() {
        return eSalary;
    }

    public void setSalary(Double eSalary) {
        this.eSalary = eSalary;
    }

    public String getName() {
        return eName;
    }

    public void setName(String eName) {
        this.eName = eName;
    }
}

public class Question4 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23d, 108087.52, "Aakash"));
        employeeList.add(new Employee(23d, 10287.12, "Shivangi"));
        employeeList.add(new Employee(21d, 20188.98, "Sukirti"));
        employeeList.add(new Employee(25d, 67363.32, "Karishma"));
        employeeList.add(new Employee(27d, 36727.35, "Rajat"));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });
        System.out.println("Employees according to highest and lowest salary order are :");
        for (Employee e : employeeList) {
            System.out.println("Employee name :" + e.getName() + " ,Employee age: " + e.getAge() + " ,Employee salary: " + e.getSalary());
        }
    }
}
