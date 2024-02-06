package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Employee employee0 = new Employee("Ivan", "Ivanov", "Ivanovich",
                "engineer", "5558124", 65000, 1997);
        Employee employee1 = new Employee("Petr", "Ivanov", "Ivanovich",
                "engineer", "26651654", 75000, 1974);
        Employee employee2 = new Employee("Nikolay", "Ivanov", "Ivanovich",
                "engineer", "5147541", 85000, 1978);
        Employee employee3 = new Employee("Mikhail", "Ivanov", "Ivanovich",
                "engineer", "41514", 95000, 1995);
        Employee employee4 = new Employee("Fedor", "Ivanov", "Ivanovich",
                "engineer", "5327852", 105000, 1992);
        Supervisor supervisor = new Supervisor("SuperFedor", "Ivanov", "Ivanovich",
                "supervisor", "5327852", 200_000, 1993);

        List<Employee> employees = new ArrayList<>();
       employees.add(employee0);
       employees.add(employee1);
       employees.add(employee2);
       employees.add(employee3);
       employees.add(employee4);
       employees.add(supervisor);


        ViewEmployee employeeView = new ViewEmployee();
        ControllerEmp controllerEmp = new ControllerEmp(employees, employeeView);

        System.out.println("Зарплата сотрудников до повышения:");
        controllerEmp.printEmployeeDetails();

        controllerEmp.increaseSalary(employees.toArray(new Employee[0]), 10000);
        System.out.println("\nЗарплата сотрудников после повышения:");
        controllerEmp.printEmployeeDetails();

    }
}
