package lesson3;

public class ViewEmployee { public void printEmployeeDetails(Employee employee) {
    System.out.println("Employee{" +
            "name='" + employee.getFirstName() + '\'' +
            ", salary=" + employee.getSalary() +
            ", age=" + employee.getAge() +
            '}');
}}
