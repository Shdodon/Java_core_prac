package lesson3;

import java.util.List;

public class ControllerEmp {
    private List<Employee> employees;
    private ViewEmployee viewEmployee;

    public ControllerEmp(List<Employee> employees, ViewEmployee employeeView) {
        this.employees = employees;
        this.viewEmployee = employeeView;
    }

    /**
     * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
     */
    public static void increaseSalary(Employee[] employees, Integer amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Supervisor)) {
                employee.increaseSalary(amount);
            }
        }
    }

    public void printEmployeeDetails() {
        for (Employee employee : employees) {
            viewEmployee.printEmployeeDetails(employee);
        }
    }
}
